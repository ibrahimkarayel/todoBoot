package tr.com.jowl.service.impl;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tr.com.jowl.model.Task;
import tr.com.jowl.service.TaskService;
import tr.com.jowl.utils.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The TaskServiceImpl Test class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TaskServiceImplTest {

    @Autowired
    private TaskService taskService;

    private static List<Task> taskList;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll - oneTimeSetUp");
        taskList = new ArrayList<>();
        Task task;
        for (int i = 0; i < 5; i++) {
            task = new Task();
            task.setUserId(1);
            task.setStatus(Status.ACTIVE.getValue());
            task.setCreateDate(LocalDateTime.now());
            task.setTaskDate(LocalDate.now());
            task.setTaskName("Test Task" + i);
            task.setDescription("Test Desc" + i);
            task.setContent("Test Task Content " + i);
            taskList.add(task);
        }
    }

    @AfterAll
    public static void afterAll() {
        // one-time cleanup code
        System.out.println("@AfterAll - oneTimeTearDown");
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        System.out.println("@BeforeEach - TaskServiceImplTest setUp");
    }

    @AfterEach
    public void afterEach() throws Exception {
        System.out.println("@AfterEach - TaskServiceImplTest tearDown");
    }

    @Test
    void testSave() {
        List<Task> beforeInsert = taskService.findAll();
        int start = beforeInsert.get(beforeInsert.size() - 1).getId();
        taskList.forEach(task -> {
            taskService.save(task);
        });
        List<Task> afterInsert = taskService.findAll();
        int end = afterInsert.get(afterInsert.size() - 1).getId();
        assertEquals((afterInsert.size() - beforeInsert.size()), taskList.size());

        List<Task> inserted = taskService.findBetween(start + 1, end);

        delete(inserted);

    }

    void delete(List<Task> tasks) {
        tasks.forEach(task -> {
            assertNotNull(taskService.findById(task.getId()));
            taskService.delete(task.getId());
            try {
                taskService.findById(task.getId());
                fail("No value present");
            } catch (NoSuchElementException e) {

            }

        });

    }

}
package tr.com.jowl.service.impl;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tr.com.jowl.model.User;
import tr.com.jowl.service.UserService;
import tr.com.jowl.utils.PassEncoding;
import tr.com.jowl.utils.Roles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The UserServiceImpl Test class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;
    private static List<User> userList;

    @BeforeAll
    public static void oneTimeSetUp() {
        System.out.println("@BeforeAll - oneTimeSetUp");
        userList = new ArrayList<>();
        User user;
        for (int i = 0; i < 6; i++) {
            String pass = PassEncoding.getInstance().passwordEncoder.encode("test_passw" + i);
            user = new User("test_user_" + i, pass, "test" + i + "@gmail.com", Roles.ROLE_USER.getValue());
            userList.add(user);
        }

    }

    @AfterAll
    public static void afterAll() {
        // one-time cleanup code
        System.out.println("@AfterAll - oneTimeTearDown");
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        System.out.println("@BeforeEach - UserService setUp");
    }

    @AfterEach
    public void afterEach() throws Exception {
        System.out.println("@AfterEach - UserService tearDown");
    }


    @Test
    public void testSave() {
        User user = userList.get(0);
        User save = userService.save(user);
        assertNotNull(save);
        testDelete(user);
    }

    public void testDelete(User user) {
        assertEquals(userService.delete(user.getId()), true);
    }

    @Test
    public void testUpdate() {
        User user = userService.save(userList.get(2));
        assertEquals(user.getEmail(), "test2@gmail.com");
        user.setEmail("update@gmail.com");
        User update = userService.update(user);
        assertEquals(update.getEmail(), "update@gmail.com");
        testDelete(update);
    }


}
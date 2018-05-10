package tr.com.jowl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.jowl.model.Task;
import tr.com.jowl.repository.TaskRepository;
import tr.com.jowl.service.TaskService;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The TaskServiceImpl class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Boolean delete(int id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Task update(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task findById(int id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> findAll() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public List<Task> findByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    @Override
    public List<Task> findByUserIdStatus(int userId, String status) {
        //return  taskRepository.findByUserIdStatus(userId, status);
        return  taskRepository.findByUserIdAndStatus(userId, status);
    }

    @Override
    public List<Task> findBetween(int start, int end) {
        return taskRepository.findBetween(start, end);
    }
}

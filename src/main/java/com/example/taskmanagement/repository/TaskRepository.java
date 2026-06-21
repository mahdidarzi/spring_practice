package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {

    private final Map<Long, Task> tasks = new HashMap<>();
    private Long currentId = 1L;

    public Task save(Task task) {
        task.setId(currentId++);
        tasks.put(task.getId(), task);
        return task;
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }
}

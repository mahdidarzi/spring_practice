package com.example.taskmanagement.controller;


import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @GetMapping
    public List<Task> getTasks(@RequestParam(required = false) String priority) {

        if (priority != null) {
            return taskService.getTasksByPriority(priority);
        }

        return taskService.getAllTasks();
    }
    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTask(id);
    }
}

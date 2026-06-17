package com.example.demo.controller;

import com.example.demo.dto.CreateTaskRequest;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id);
    }

    @GetMapping
    public List<Task> getTasksByPriority(@RequestParam String priority) {
        return service.getTasksByPriority(priority);
    }

    @PostMapping
    public Task createTask(@Valid @RequestBody CreateTaskRequest request) {

        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setPriority(request.getPriority());

        return service.createTask(task);
    }
}

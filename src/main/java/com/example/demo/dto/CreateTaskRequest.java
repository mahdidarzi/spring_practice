package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateTaskRequest {

    @NotBlank(message = "\"Title must not be blank\"")
    private String title;

    private String description;

    private String priority;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

package com.example.myfirstwebapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    @Size(min = 10, max = 50, message = "enter at least 10 charecters")
    private String description;
    private LocalDate targetDate;
    private boolean completed;

    public Todo(int id, String username, String description, LocalDate targetDate,boolean completed ) {
        this.completed = completed;
        this.targetDate = targetDate;
        this.description = description;
        this.username = username;
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", completed=" + completed +
                '}';
    }
}

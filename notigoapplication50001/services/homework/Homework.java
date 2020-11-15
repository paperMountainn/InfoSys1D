package com.example.notigoapplication50001.services.homework;

import java.time.LocalDateTime;

public class Homework {
    public Homework(String name, LocalDateTime dueDate) {
        this.dueDate = dueDate;
        this.name = name;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public String getName() {
        return name;
    }

    private final LocalDateTime dueDate;
    private final String name;
}

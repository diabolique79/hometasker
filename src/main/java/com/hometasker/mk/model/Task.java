package com.hometasker.mk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

public class Task {
    private int id;
    private String taskName;
    private Integer points;
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    private LocalDateTime deadlineDate;

    public Task(int id, String taskName, Integer points) {
        this.id = id;
        this.taskName = taskName;
        this.points = points;
        //this.deadlineDate = deadlineDate;
    }
}

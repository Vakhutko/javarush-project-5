package com.javarush.controller;

import com.javarush.domain.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskInfoTest {
    TaskInfo taskInfo = new TaskInfo();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
        taskInfo.setDescription("hello");
        assertEquals(taskInfo.getDescription(), "hello");
    }

    @Test
    void getStatus() {
    }

    @Test
    void setStatus() {
        taskInfo.setStatus(Status.DONE);
        assertEquals(taskInfo.getStatus(), Status.DONE);
    }
}
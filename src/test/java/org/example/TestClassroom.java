package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClassroom {

    Classroom classroom;

    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Jahid", classroom.setName("Jahid"), "Name field should work");
    }

    @Test
    @DisplayName("Age should be set")
    void testSetAge() {
        assertEquals(20, classroom.setAge(20), "Age set should work");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("Baku", classroom.setAddress("Baku"), "Address field should work");
    }

    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("cako@gmail.com", classroom.setEmail("cako@gmail.com"), "Email field should");
    }

    @Test
    @DisplayName("Classroom type should be set")
    void testSetClassroomType() {
        assertEquals(classroomType.EVENING, classroom.setClassoomType(classroomType.EVENING), "Classroom type should include evening or morning");
    }
}
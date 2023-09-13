package com.example.petclinicdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Testing!
class HelloControllerTest {
    @Test
    void helloWorld() {
        HelloController helloController = new HelloController();
        assertEquals("Hello, World!", helloController.helloWorld());
    }

}
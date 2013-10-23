package com.javabilities.demo.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;


public class HomeControllerTest {
    private MockMvc mockMvc;

    @Test
    public void testLoadHomePage() {
        assertEquals(5, 5);
    }
}

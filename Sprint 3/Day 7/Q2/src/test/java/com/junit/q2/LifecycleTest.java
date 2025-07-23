package com.junit.q2;

import org.junit.jupiter.api.*;

public class LifecycleTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll: Runs once before all test methods");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach: Runs before each test method");
    }

    @Test
    public void test1() {
        System.out.println("Executing test1");
        Assertions.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Executing test2");
        Assertions.assertTrue(true);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach: Runs after each test method");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll: Runs once after all test methods");
    }
}

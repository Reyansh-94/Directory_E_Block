package com.webdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebdemoApplicationTests {

	@Test
	void contextLoads() {
	}
	

	    @BeforeAll
	    static void setUpBeforeAll() {
	        System.out.println("This runs once before all tests.");
	    }

	    @AfterAll
	    static void tearDownAfterAll() {
	        System.out.println("This runs once after all tests.");
	    }

	    @BeforeEach
	    void setUp() {
	        System.out.println("This runs before each test.");
	    }

	    @AfterEach
	    void tearDown() {
	        System.out.println("This runs after each test.");
	    }

	    @Test
	    @DisplayName("Test Case 1: Addition")
	    void testAddition() {
	        int result = 2 + 3;
	        assertEquals(5, result, "2 + 3 should equal 5");
	    }

	    @Test
	    @DisplayName("Test Case 2: Subtraction")
	    void testSubtraction() {
	        int result = 5 - 3;
	        assertEquals(2, result, "5 - 3 should equal 2");
	    }

	    @Test
	    @Disabled("This test is disabled for demonstration purposes.")
	    void disabledTest() {
	        System.out.println("This test is disabled and will not run.");
	    }
	}


package com.zholtikov;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    public void testHelloSuccess() {
        String a = "Hello ";
        String b = "world";

        String result = a + b;

        assertEquals(result, "Hello world");

    }


    @Test
    public void testHelloFailed() {
        String a = "Hello ";
        String b = "error";

        String result = a + b;

        assertNotEquals(result, "Hello world");

    }

    @Test
    public void testHelloFailedButExpectedOk() {
        String a = "Hello ";
        String b = "world-3";

        String result = a + b;

        assertNotEquals(result, "Hello world");

    }


    @Test
    public void testFail() {
        String a = "Hello ";
        String b = "world-2";

        String result = a + b;
//I broke this test
        assertEquals(result, "Hello world");

    }

}
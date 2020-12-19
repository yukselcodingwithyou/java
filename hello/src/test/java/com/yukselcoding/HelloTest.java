package com.yukselcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {


    @Test
    void testHelloWorldSuccess() {
        Hello hello = new Hello();
        assertEquals("Hello, World.", hello.hello());
    }

    @Test
    void testHelloWithNameSuccess() {
        String name = "Ali";
        String expected = String.format("Hello, %s.", name);
        Hello hello = new Hello();
        assertEquals(expected, hello.hello(name));
    }

    @Test
    void testHelloWithEmptyString() {
        Hello hello = new Hello();
        assertEquals("Hello, World.", hello.hello(""));
    }
}
package com.yukselcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("Should check hello() method in Hello class returns correctly.")
    void testHelloWorldSuccess() {
        Hello hello = new Hello();
        assertEquals("Hello, World.", hello.hello());
    }

    @Test
    @DisplayName("Should check hello returns correct result against given name.")
    void testHelloWithNameSuccess() {
        String name = "Ali";
        String expected = String.format("Hello, %s.", name);
        final Hello hello = new Hello();
        assertEquals(expected, hello.hello(name));
    }

    @Test
    @DisplayName("Should check hello returns correct result against empty string.")
    void testHelloWithEmptyString() {
        final Hello hello = new Hello();
        assertEquals("Hello, World.", hello.hello(""));
    }

    @Test
    @DisplayName("Should check hello throws NullPointerException against null value.")
    void testHelloWithNullValue() {
        final Hello hello = new Hello();
        assertThrows(NullPointerException.class, () -> hello.hello(null));
    }
}
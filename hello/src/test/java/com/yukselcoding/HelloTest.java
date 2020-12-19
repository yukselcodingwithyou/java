package com.yukselcoding;

import com.yukselcoding.exception.NullValueProvidedException;
import com.yukselcoding.service.Hello;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("Should check hello method in Hello class returns correctly.")
    void testHelloWorldSuccess() {
        Hello hello = new Hello();
        assertEquals(Hello.HELLO_WORLD, hello.hello());
    }

    @Test
    @DisplayName("Should check hello returns correct result against given name.")
    void testHelloWithNameSuccess() throws NullValueProvidedException {
        String name = "Ali";
        String expected = String.format(Hello.FORMAT, name);
        final Hello hello = new Hello();
        assertEquals(expected, hello.hello(name));
    }

    @Test
    @DisplayName("Should check hello returns correct result against empty string.")
    void testHelloWithEmptyString() throws NullValueProvidedException {
        final Hello hello = new Hello();
        assertEquals(Hello.HELLO_WORLD, hello.hello(""));
    }

    @Test
    @DisplayName("Should check hello throws NullValueProvidedException against null value.")
    void testHelloWithNullValue() {
        final Hello hello = new Hello();
        NullValueProvidedException exception = assertThrows(NullValueProvidedException.class, () -> hello.hello(null));
        assertEquals(exception.getMessage(), Hello.EXCEPTION_MESSAGE);
    }
}
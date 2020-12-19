package com.yukselcoding.service;

import com.yukselcoding.exception.NullValueProvidedException;

public class Hello {


    public static String HELLO_WORLD = "Hello, World.";
    public static String FORMAT = "Hello, %s.";
    public static String EXCEPTION_MESSAGE = "Null value provided as name parameter.";

    /**
     * Simple hello methods, says hi to whole world :)
     * @return "Hello, World." string literal
     */
    public String hello() {
        return HELLO_WORLD;
    }


    /**
     * Simple Hello method, says hi to people with specific name :)
     * @param name : name of the person to say hi :)
     * @return "Hello {name}" string literal
     */
    public String hello(String name) throws NullValueProvidedException {
        try {
            if(name.equals(""))
                return HELLO_WORLD;
            return String.format(FORMAT, name);
        } catch (NullPointerException e) {
            throw new NullValueProvidedException(EXCEPTION_MESSAGE);
        }
    }
}

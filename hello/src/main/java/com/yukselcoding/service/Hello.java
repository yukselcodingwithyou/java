package com.yukselcoding.service;

import com.yukselcoding.exception.NullValueProvidedException;

public class Hello {


    /**
     * Simple hello methods, says hi to whole world :)
     * @return "Hello, World." string literal
     */
    public String hello() {
        return "Hello, World.";
    }


    /**
     * Simple Hello method, says hi to people with specific name :)
     * @param name : name of the person to say hi :)
     * @return "Hello {name}" string literal
     */
    public String hello(String name) throws NullValueProvidedException {
        try {
            if(name.equals(""))
                return "Hello, World.";
            return String.format("Hello, %s.", name);
        } catch (NullPointerException e) {
            throw new NullValueProvidedException("Null value provided as name parameter.");
        }
    }
}

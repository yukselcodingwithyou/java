package com.yukselcoding;

public class Hello {

    public String hello() {
        return "Hello, World.";
    }

    public String hello(String name) {
        if(name.equals(""))
            return "Hello, World.";
        return String.format("Hello, %s.", name);
    }
}

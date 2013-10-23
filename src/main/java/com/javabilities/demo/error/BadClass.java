package com.javabilities.demo.error;


public class BadClass {
    public void badMethod() {
        System.out.println("I'm not using a logging framework.");

        try {
            int blah = 0;
        }
        catch (Exception e) { }
        String blah = null;
        if (blah.equals("Something"));
    }
}

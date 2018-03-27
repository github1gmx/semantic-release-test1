package com.github1gmx.semanticreleasetest1;

public class HelloWorld {

    public String getMessage() {
        return "Hello World";
    }

    public static void main(String[] args) {
        String message = new HelloWorld().getMessage();
        System.out.println(message);
    }

}

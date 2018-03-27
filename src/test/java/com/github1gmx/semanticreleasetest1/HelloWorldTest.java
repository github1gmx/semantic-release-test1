package com.github1gmx.semanticreleasetest1;

import static org.junit.Assert.*;
import org.junit.Test;


public class HelloWorldTest {

    @Test
    public void testMessage() {
        String message = new HelloWorld().getMessage();
        assertEquals("Hello World", message);
    }

}

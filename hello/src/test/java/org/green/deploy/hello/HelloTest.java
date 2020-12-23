package org.green.deploy.hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    @Test public void testGreeting() {
        final Hello classUnderTest = new Hello();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}

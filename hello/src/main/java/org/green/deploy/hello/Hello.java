package org.green.deploy.hello;

import org.green.deploy.util.Library;

public class Hello {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(final String[] args) {
        final Library library = new Library();
        final Hello hello = new Hello();
        library.log(hello.getGreeting());
    }
}

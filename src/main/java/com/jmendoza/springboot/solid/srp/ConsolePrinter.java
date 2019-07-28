package com.jmendoza.springboot.solid.srp;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println("value: " + value);
    }
}

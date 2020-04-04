package com.jmendoza.springboot.solid.srp;

public class Circle implements Shapes {

    private double radius;
    private Printer printer;

    public Circle(double radius, Printer printer) {
        this.radius = radius;
        this.printer = printer;
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(Math.PI * radius * radius));
    }
}

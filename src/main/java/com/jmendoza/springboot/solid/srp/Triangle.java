package com.jmendoza.springboot.solid.srp;

public class Triangle implements Shapes {

    private double height;
    private double base;
    private Printer printer;

    public Triangle(double height, double base, Printer printer) {
        this.height = height;
        this.base = base;
        this.printer = printer;
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf((height * base) / 2));
    }
}

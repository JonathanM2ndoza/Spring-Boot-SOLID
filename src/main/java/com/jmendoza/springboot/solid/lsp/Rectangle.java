package com.jmendoza.springboot.solid.lsp;

public class Rectangle implements Shapes {

    private double length;
    private double breadth;
    private Printer printer;

    public Rectangle(double length, double breadth, Printer printer) {
        this.length = length;
        this.breadth = breadth;
        this.printer = printer;
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(length * breadth));
    }
}

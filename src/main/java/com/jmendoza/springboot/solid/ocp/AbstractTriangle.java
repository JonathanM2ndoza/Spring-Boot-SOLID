package com.jmendoza.springboot.solid.ocp;

public abstract class AbstractTriangle implements Shapes {
    public double height;
    public double base;
    public Printer printer;

    public AbstractTriangle(double height, double base, Printer printer) {
        this.height = height;
        this.base = base;
        this.printer = printer;
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf((height * base) / 2));
    }

    public abstract void getAllSides();
}

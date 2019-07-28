package com.jmendoza.springboot.solid.ocp;

public class Equilateral extends AbstractTriangle {

    public Equilateral(double height, double base, Printer printer) {
        super(height, base, printer);
    }

    @Override
    public void getAllSides() {
        //The 3 sides (a, b and c) are equal
        printer.printValue(String.valueOf(base));
        printer.printValue(String.valueOf(base));
        printer.printValue(String.valueOf(base));

    }
}

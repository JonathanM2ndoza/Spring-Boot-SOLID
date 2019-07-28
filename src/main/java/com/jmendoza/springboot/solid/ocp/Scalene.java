package com.jmendoza.springboot.solid.ocp;

public class Scalene extends AbstractTriangle implements RightTriangle {

    public Scalene(double height, double base, Printer printer) {
        super(height, base, printer);
    }

    @Override
    public void getAllSides() {
        printer.printValue(String.valueOf(base));
        calculateHypotenuse(height, base / 2);
        calculateHypotenuse(height, base / 2);
    }

    @Override
    public void calculateHypotenuse(double side1, double side2) {
        double sqrt = Math.sqrt(
                side1 * side1 + side2 * side2);
        printer.printValue(String.valueOf(sqrt));
    }
}

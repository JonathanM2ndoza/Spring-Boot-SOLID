package com.jmendoza.springboot.solid.dip;

public class Circle implements CircumferenceShape {

    private double radius;
    //DIP - Abstract Type
    private Printer printer;

    public Circle(double radius, Printer printer) {
        this.radius = radius;
        this.printer = printer;
    }

    @Override
    public void calculateCircumference() {
        printer.printValue(String.valueOf(3.14f * 2 * radius));
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(3.14f * radius * radius));
    }
}

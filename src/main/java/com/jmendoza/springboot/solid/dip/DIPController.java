package com.jmendoza.springboot.solid.dip;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/solid/dip")
public class DIPController {

    @GetMapping(value = "/")
    public ResponseEntity dip(HttpServletRequest request) {

        Printer printer = new ConsolePrinter();
        printer.printValue("===========Dependency Inversion Principle (DIP)===========");

        Writer writer = new FileWriter("/home/jmendoza/dip.txt");
        printer = new FilePrinter(writer);

        CircumferenceShape circle = new Circle(4, printer);
        printer.printValue("===========Dependency Inversion Principle (DIP)===========");
        printer.printValue("Circle Area.....");
        circle.calculateArea();
        printer.printValue("Circle Circumference.....");
        circle.calculateCircumference();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}

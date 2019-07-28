package com.jmendoza.springboot.solid.srp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/solid/srp")
public class SRPController {

    @GetMapping(value = "/")
    public ResponseEntity srp(HttpServletRequest request) {

        Printer printer = new ConsolePrinter();
        printer.printValue("===========Single Responsibility Principle (SRP)===========");

        Shapes circle = new Circle(34, printer);
        printer.printValue("Circle Area.....");
        circle.calculateArea();

        Shapes triangle = new Triangle(6, 6, printer);
        printer.printValue("Triangle Area.....");
        triangle.calculateArea();

        return new ResponseEntity("OK", HttpStatus.OK);
    }

}

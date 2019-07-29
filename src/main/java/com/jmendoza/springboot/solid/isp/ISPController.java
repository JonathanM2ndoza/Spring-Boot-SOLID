package com.jmendoza.springboot.solid.isp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/solid/isp")
public class ISPController {

    @GetMapping(value = "/")
    public ResponseEntity isp(HttpServletRequest request) {

        Printer printer = new ConsolePrinter();
        printer.printValue("===========Interface Segregation Principle (ISP)===========");

        CircumferenceShape circle = new Circle(4, printer);
        printer.printValue("Circle Area.....");
        circle.calculateArea();
        printer.printValue("Circle Circumference.....");
        circle.calculateCircumference();

        CircumferenceShape sphere = new Sphere(4, printer);
        printer.printValue("Sphere Area.....");
        sphere.calculateArea();
        printer.printValue("Sphere Circumference.....");
        sphere.calculateCircumference();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}

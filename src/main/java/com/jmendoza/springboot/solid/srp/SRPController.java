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

        Shapes circle = new Circle(34, printer);
        circle.calculateArea();

        Shapes triangle = new Triangle(34, 6, printer);
        triangle.calculateArea();

        return new ResponseEntity("OK", HttpStatus.OK);
    }

}

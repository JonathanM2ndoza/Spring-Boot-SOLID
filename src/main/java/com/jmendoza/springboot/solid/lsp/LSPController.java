package com.jmendoza.springboot.solid.lsp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/solid/lsp")
public class LSPController {

    @GetMapping(value = "/")
    public ResponseEntity lsp(HttpServletRequest request) {

        Printer printer = new ConsolePrinter();
        printer.printValue("===========Liskov Substitution Principle (LSP)===========");

        Shapes rectangle = new Rectangle(3, 4, printer);
        printer.printValue("Rectangle Area.....");
        rectangle.calculateArea();

        rectangle = new Square(8,printer);
        printer.printValue("Square Area.....");
        rectangle.calculateArea();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}

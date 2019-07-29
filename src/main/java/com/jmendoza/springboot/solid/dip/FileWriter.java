package com.jmendoza.springboot.solid.dip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter implements Writer {

    private String outputPath;

    public FileWriter(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public void writeValue(String value) {
        try {
            Files.write(Paths.get(outputPath), value.concat("\r\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

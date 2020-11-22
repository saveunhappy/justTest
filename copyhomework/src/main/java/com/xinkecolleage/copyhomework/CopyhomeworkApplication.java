package com.xinkecolleage.copyhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.OutputStream;

@SpringBootApplication
public class CopyhomeworkApplication {

    public static void main(String[] args) {
      //  OutputStream os =  new FileOutputStream(filePath);
        SpringApplication.run(CopyhomeworkApplication.class, args);
    }

}

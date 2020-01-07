package com.github.huebnerf.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // Markiert Main- (Start-) Klasse des Programms
public class SpringdemoApplication {

    public static void main(String[] args) {

        // Kontext der SpringApplication in Variable speichern
        ApplicationContext applicationContext = SpringApplication.run(SpringdemoApplication.class, args);

        // Initialisieren der Component (managed Bean) der Klasse SysoPrinter.
        SysoPrinter sysoPrinter = (SysoPrinter) applicationContext.getBean("sysoPrinter");

        // Ausführen von Methoden der Component
        sysoPrinter.setMessage("Hello World!");
        sysoPrinter.printMessage();
        sysoPrinter.setMessage("This is a Spring Project.");
        sysoPrinter.printMessage();

    }

}

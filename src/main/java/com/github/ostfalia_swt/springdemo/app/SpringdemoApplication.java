package com.github.ostfalia_swt.springdemo.app;

import com.github.ostfalia_swt.springdemo.util.SysoPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// Markiert Main- (Start-) Klasse des Programms
@SpringBootApplication
// Startet einen Scan für Spring Components im Package "com.github.huebnerf.sysoprinter"
@ComponentScan("com.github.ostfalia_swt.springdemo.util")
public class SpringdemoApplication {

    // Markiert property setter oder constructor für automatische injection
    @Autowired
    private SysoPrinter sysoPrinter;

    public static void main(String[] args) {

        // Kontext der SpringApplication in Variable speichern
        ApplicationContext applicationContext = SpringApplication.run(SpringdemoApplication.class, args);

        // Initialisieren der Component (managed Bean) der Klasse SysoPrinter.
        SysoPrinter sysoPrinter = (SysoPrinter) applicationContext.getBean("sysoPrinter");

        // Ausführen von Methoden der Component
        sysoPrinter.lineBreak();
        sysoPrinter.setMessage("Hello World!");
        sysoPrinter.printMessage();
        sysoPrinter.setMessage("This is a Spring Project.");
        sysoPrinter.printMessage();

    }

}

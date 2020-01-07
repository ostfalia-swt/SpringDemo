package com.github.huebnerf.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringdemoApplication.class, args);

        SysoPrinter sysoPrinter = (SysoPrinter) applicationContext.getBean("sysoPrinter");

        sysoPrinter.setMessage("Hello World!");
        sysoPrinter.printMessage();

        sysoPrinter.setMessage("This is a Spring Project");
        sysoPrinter.printMessage();

    }

}

package com.github.huebnerf.springdemo;

import org.springframework.stereotype.Component;

@Component // Markiert eine Spring Component (automatisch verwaltetes "managed" Bean)
public class SysoPrinter {

    private String message = "";

    void setMessage(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(message);
    }

}

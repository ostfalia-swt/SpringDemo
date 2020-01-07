package com.github.huebnerf.springdemo.util;

import org.springframework.stereotype.Component;

@Component // Markiert eine Spring Component (automatisch verwaltetes "managed" Bean)
public class SysoPrinter {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public void lineBreak() {
        System.out.println();
    }

}

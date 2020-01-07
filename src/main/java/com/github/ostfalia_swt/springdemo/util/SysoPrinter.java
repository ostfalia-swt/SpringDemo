package com.github.ostfalia_swt.springdemo.util;

import org.springframework.stereotype.Component;

// Markiert eine Spring Component (automatisch verwaltetes "managed" Bean)
@Component
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

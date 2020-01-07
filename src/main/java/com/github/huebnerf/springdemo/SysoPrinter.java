package com.github.huebnerf.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SysoPrinter {

    private String message = "";

    void setMessage(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(message);
    }

}

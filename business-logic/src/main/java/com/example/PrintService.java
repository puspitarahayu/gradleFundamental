package com.example;

public class PrintService {

    public void print(MessageModel model) {
        String message = model.getMessage().trim();
        System.out.println(message);
    }
}

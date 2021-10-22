package com.example.webfluxdemo.service;

public class SleepUtil {
    public static void sleepSeconds(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

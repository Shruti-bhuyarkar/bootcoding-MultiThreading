package com.bootcoding.java.multithreading.mythread;

public class AlphabetThread  extends Thread {
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Alphabet Task is executed!");
        }
    }
}
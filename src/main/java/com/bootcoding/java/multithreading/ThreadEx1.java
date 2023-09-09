package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.mythread.AlphabetThread;
import com.bootcoding.java.multithreading.mythread.NumberThread;
import com.bootcoding.java.multithreading.mythread.SpecialSymbolTHread;

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread thread1 = new NumberThread();
        thread1.start();
        Thread thread2 = new SpecialSymbolTHread();
        thread2.start();
        Thread thread3 = new AlphabetThread();
        thread3.start();

    }
}

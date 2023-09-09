package com.bootcoding.java.multithreading;


import com.bootcoding.java.multithreading.mythread.PalindromeThread;
import com.bootcoding.java.multithreading.mythread.PrimeNumThread;
import com.bootcoding.java.multithreading.mythread.FibonacciThread;

public class ThreadEx2 {
    public static void main(String[] args) {

        Thread t = new Thread();
        t.start();
        Thread t1 = new PalindromeThread();
        t1.start();
        Thread t2 = new PrimeNumThread();
        t2.start();
        Thread t3 = new FibonacciThread();
        t3.start();
    }
}


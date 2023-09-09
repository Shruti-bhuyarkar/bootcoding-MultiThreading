package com.bootcoding.java.multithreading.mythread;

public class SpecialSymbolTHread  extends Thread{

        public void run(){
            for(int i = 0; i < 100000; i++) {
                System.out.println("Special symbol Task is executed!");
            }
        }
    }


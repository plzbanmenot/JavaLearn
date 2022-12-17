package org.example.thread;

public class ThreadByThreadTest extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from extended thread");
    }
}

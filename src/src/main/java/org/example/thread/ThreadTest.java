package org.example.thread;

public class ThreadTest implements Runnable{
    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
                System.out.println("Hello from another thread");
            } catch (Exception e){}
        }
    }
}

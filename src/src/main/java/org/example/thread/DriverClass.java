package org.example.thread;

import java.util.concurrent.locks.LockSupport;

public class DriverClass {
    public static int mValue = 0;
    static VolatileTest mInc;

    public static void main(String[] args) throws InterruptedException {

        //Basic examples
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest);
        Thread thread1 = new Thread(() -> System.out.println("Hello from anon thread"));
        ThreadByThreadTest threadByThreadTest = new ThreadByThreadTest();
        Thread thread2 = new Thread("Random thread");


        //daemon
        thread.setDaemon(true);
        //start
        thread.start();

        //run
        thread.run();
        thread1.run();
        threadByThreadTest.run();
        thread.start();

        //Volatile
        VolatileTest mInc = new VolatileTest();
        mInc.start();

        for (int i = 1; i < 3; i++){
            try{
                Thread.sleep(i*2*1000); //Ожидание в течении i*2 сек.
            }catch(InterruptedException e){}

            mInc.changeDirection();
        }
        mInc.finish();
        mInc.interrupt();

        //Sleep
        try {
            Thread.sleep(3000);
        } catch (Exception ex){
            System.out.println("sleep failed");
        }
        System.out.println("Hello from main thread");

        thread.interrupt();

        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("thread");
            }
        };

        Thread th1 = new Thread(task);
        th1.start();
        synchronized (lock) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.print("  " + i);
                System.out.print(th1.getState());
            }
            System.out.println(" ...");
        }
        System.out.print(th1.getState());


        JoinThreadTest joinThreadTest = new JoinThreadTest();
        joinThreadTest.setCircleCount(10);
        joinThreadTest.start();

        while (joinThreadTest.isAlive()){
            try{
                //joinThreadTest.setPriority(Thread.MIN_PRIORITY);
                joinThreadTest.join(0);
                //Thread.yield();
            } catch (InterruptedException e){
                System.out.println("Превышено время ожидания");
            }
        }
        System.out.println("Выполнение завершено");


        Object object = new Object();

        Runnable task2 = () -> {
            synchronized (object){
                try {
                    object.wait();
                    System.out.println("after wait");
                } catch (InterruptedException e){
                    System.out.println("ОШИБКА");
                }
            }
            System.out.println("Свобода");
        };

        Thread thread3 = new Thread(task2);
        thread3.start();
        Thread.currentThread().sleep(10000);
        System.out.println("Main done");
        synchronized (object){
            object.notify();
        }

        Runnable task3 = () -> {
            System.err.println("Будет запаркован");
            LockSupport.park();
            System.err.println("Распаркован");
        };

        Thread thread4 = new Thread(task3);
        thread4.start();
        Thread.currentThread().sleep(3000);
        System.err.println("Статус таска " + thread4.getState());
        LockSupport.unpark(thread4);
        Thread.currentThread().sleep(3000);
    }
}

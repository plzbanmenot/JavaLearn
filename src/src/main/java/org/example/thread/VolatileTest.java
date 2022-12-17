package org.example.thread;

public class VolatileTest extends Thread{

    private volatile boolean iSincriment = true;
    private volatile boolean isFinish = false;

    public void changeDirection(){
        iSincriment = !iSincriment;
    }

    public void finish(){
        isFinish = true;
    }

    @Override
    public void run(){
        while (!Thread.interrupted()){
            System.out.println("value is " + (iSincriment ? ++DriverClass.mValue : --DriverClass.mValue));
            try{
                Thread.sleep(1000);		//Приостановка потока на 1 сек.
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

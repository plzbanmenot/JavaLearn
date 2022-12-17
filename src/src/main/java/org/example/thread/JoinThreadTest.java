package org.example.thread;

public class JoinThreadTest extends Thread{
    private volatile int circleCount;

    @Override
    public void run(){
        for (int i = 0; i < circleCount; i++){
            System.out.println("проход номер" + (i+1));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                return;
            }
        }
    }

    public void setCircleCount(int circleCount) {
        this.circleCount = circleCount;
    }
}

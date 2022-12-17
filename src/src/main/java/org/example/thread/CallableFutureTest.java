package org.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {
    public static void main(String[] args) throws Exception{
        //var test = new ArrayList<String>();
        String test = "324234\n4234";
        test.isBlank();
        test.repeat(12);


        Callable task = () -> {
            return "Hello, Callable";
        };
        FutureTask<String> fTask = new FutureTask<>(task);
        new Thread(fTask).start();
        System.out.println(fTask.get());
    }

}

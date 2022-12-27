package org.example.datetime;

public class AdditionalTests {
    public static void main(String[] args){
        //execution time
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            int a = i + 100;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}

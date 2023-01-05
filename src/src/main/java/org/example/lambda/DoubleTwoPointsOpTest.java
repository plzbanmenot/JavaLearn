package org.example.lambda;

import java.util.List;

public class DoubleTwoPointsOpTest {
    public  static void main(String args[]){
        List.of(1,2,3,5,6).stream().map(Integer::toBinaryString).forEach(System.out::println);
        IntMultipleTestInterface intMultipleTestInterface =  x-> MultiTest.multiple(x);
        List.of(1,2,3,5,6).stream().map(MultiTest::multiple).forEach(System.out::println);
        List.of(1,2,3,5,6).stream().map(x ->MultiTest.test(intMultipleTestInterface, x)).forEach(System.out::println);
        //List.of(1,2,3,5,6).stream().map().forEach(System.out::println);
    }
}

class MultiTest{
    static int multiple(int a){
        return a * a;
    }

    static int test(IntMultipleTestInterface i, int x){
        return i.multiply(x);
    }
}

package org.example.lambda;

import java.util.List;

public class DoubleTwoPointsOpTest {
    public  static void main(String args[]){
        List.of(1,2,3,5,6).stream().map(Integer::toBinaryString).forEach(System.out::println);
    }
}

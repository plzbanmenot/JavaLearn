package org.example.generics;

public class DriverClass {

    public static void main(String args[]){
        TwoTypesTest<Integer,String> ttt1 = new TwoTypesTest<>(1, "Hello");
        System.out.println(ttt1.getT());
        System.out.println(ttt1.getV());
        System.out.println(ttt1.getVType());
        System.out.println(ttt1.getTType());
        System.out.println(ttt1.getResult());
    }
}

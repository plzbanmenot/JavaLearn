package org.example.methods;

public class ThreeDotsMethodsTest extends ThreeDotsParents{

    public ThreeDotsMethodsTest(){
        tryThreeDots(1,2,3,4); // параметры можно передавать через запятую
        tryThreeDots(new int[]{1,2,3,4}); //можно передавать, как массив в явном виде
        tryThreeDots(); // также допустимый вызов, потому что аргумент переменной длины может иметь длину 0
        tryThreeDots(1l, 2l);
        //tryThreeDotsMulti(1); // недопустимый вызов
        //Нельзя обратиться к методу, потому что возникает неоднозначность вызова
    }

    public void tryThreeDots(long... as){
        System.out.println("Long method call");
        //nothing to do here
        for (long a: as){
            System.out.println(a);
        }
    }

    public void tryThreeDots(int... as){
        System.out.println("Int method call");
        for (int a : as){ //параметры приезжают, как int[] массив
            System.out.println(a);
        }
    }

    //multiParams
    public void tryThreeDotsMulti(int a, int... as){
        System.out.println("Call two params method");
    }

    public void tryThreeDotsMulti(int... as){
        System.out.println("Call one params method");
    }

    public static void main(String[] args){
        ThreeDotsMethodsTest tst = new ThreeDotsMethodsTest();
    }
}

class ThreeDotsParents{
    public void tryThreeDots(){
        System.out.println("Parent class call, no args");
    }
}
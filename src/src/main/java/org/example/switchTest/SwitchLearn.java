package org.example.switchTest;

public class SwitchLearn {
    //проверка кейсов нового свича для 17 джавы
    static void Switch17Test(){
        //int i = 0;
        Object o = null;
        //o = "newnew";
        o = Long.valueOf(10);
        switch (o){
            case null -> System.out.println("Nothing");
            case String s -> System.out.println(s + " is for String");
            case Long l -> System.out.println(l + " is for Long");
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }

    public static void main(String[] args){
        Switch17Test();
    }
}

package org.example.methods;

public class DynamicDispMethods {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.baseMethod();// This is base method
        a = b;
        a.baseMethod(); // This is subclass base method
    }
}

class A{
    void baseMethod(){
        System.out.println("This is base method");
    }
}

class B extends A{
    void baseMethod(){
        System.out.println("This is subclass base method");
    }
}
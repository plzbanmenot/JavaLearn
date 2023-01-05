package org.example.generics;

public class NumberGenericTest<T extends Number> {

    T number;

    public NumberGenericTest(T number){
        this.number = number;
    }

    public T getNumber(){
        return number;
    }

    public Class<? extends Number> getType(){
        return number.getClass();
    }

    public boolean isEquals(NumberGenericTest<?> val){
        return number.equals(val);
    }
}

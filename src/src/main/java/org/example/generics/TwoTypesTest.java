package org.example.generics;

public class TwoTypesTest <T,V>{
    private V v;
    private T t;

    public TwoTypesTest(T t, V v){
        this.v = v;
        this.t = t;
    }

    public String getTType(){
        return t.getClass().getName();
    }
    public String getVType(){
        return v.getClass().getName();
    }

    public String getResult(){
        if (v instanceof Integer && t instanceof  String){
            return "вот такие дела";
        } else{
            return "наши дела не пошли";
        }
    }

    public T getT(){
        return t;
    }

    public V getV(){
        return v;
    }
}

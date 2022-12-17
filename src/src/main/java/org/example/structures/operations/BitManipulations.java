package org.example.structures.operations;

public class BitManipulations {

    public static void main(String[] args){
        int i = 10;
        int k = 1;
        i >>=1;
        Integer.toBinaryString(i&~i);
        Integer.parseInt(Integer.toBinaryString(i^i), 2);
        Integer.toBinaryString(2>>1); // 1
        Integer.toBinaryString(2<<1); //100

        Integer.toBinaryString(~i>>>10); //1111111111111111111111
        Integer.toBinaryString(~i>>10); // 11111111111111111111111111111111
    }
}

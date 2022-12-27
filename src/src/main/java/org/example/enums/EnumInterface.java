package org.example.enums;

public interface EnumInterface {

    public String getAbsValueInString();

    public int getAvValue();

    default String getHaHA(){
        return "Haha is so fun";
    }
}

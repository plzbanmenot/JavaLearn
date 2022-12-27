package org.example.enums;

public enum EnumImpementsInterface implements EnumInterface{
    JAN(1, -12),
    FEB(-1, -20),
    MAR(-1, -1),
    APR(1, -1),
    MAY(1, -1),
    JUN(15, 30),
    JUL(14, 26),
    AUG(12, 24),
    SEP(10, 20),
    OCT(4, 15),
    NOV(1, 10),
    DEC(-2, -6);

    private int maxTemp;
    private int minTemp;

    private EnumImpementsInterface(int maxTemp, int minTemp){
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    @Override
    public String getAbsValueInString() {
        return String.valueOf(Math.abs(minTemp));
    }

    @Override
    public int getAvValue() {
        return (maxTemp - minTemp) / 2;
    }
}

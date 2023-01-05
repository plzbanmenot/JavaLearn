package org.example.generics;

public class ThreeDCoords extends TwoDCoords{
    int z;

    public ThreeDCoords(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}

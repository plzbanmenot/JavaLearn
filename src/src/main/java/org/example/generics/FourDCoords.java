package org.example.generics;

import java.security.PublicKey;

public class FourDCoords extends ThreeDCoords{
    int t;

    public FourDCoords(int x, int y, int z, int t){
        super(x, y, z);
        this.t = t;
    }
}

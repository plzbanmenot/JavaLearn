package org.example.generics;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class DriverClass {

    public static void main(String args[]){
        TwoTypesTest<Integer,String> ttt1 = new TwoTypesTest<>(1, "Hello");
        System.out.println(ttt1.getT());
        System.out.println(ttt1.getV());
        System.out.println(ttt1.getVType());
        System.out.println(ttt1.getTType());
        System.out.println(ttt1.getResult());

        //Number test
        NumberGenericTest<Integer> intTest = new NumberGenericTest<>(50);
        NumberGenericTest<Double> doubleTest = new NumberGenericTest<>(50.0);
        NumberGenericTest<Long> longTest = new NumberGenericTest<>(50L);
        System.out.println(intTest.getType());
        System.out.println(doubleTest.getType());
        System.out.println(longTest.getType());
        System.out.println("int " + intTest.getNumber() + " is " + (intTest.isEquals(doubleTest) ? " equals to" : " not equals to" ));

        //Coords test
        TwoDCoords[] xyCoords = new TwoDCoords[]{new TwoDCoords(1, 2),
                new TwoDCoords(2, 3),
                new TwoDCoords(3, 4),
                new TwoDCoords(4, 5)};

        FourDCoords[] xyztCoords = new FourDCoords[]{new FourDCoords(1, 2, 3, 4),
                new FourDCoords(2, 3,4,5 ),
                new FourDCoords(3, 4, 5, 6),
                new FourDCoords(4, 5, 6, 7)};

        CoordsWorkDemo.ShowXY(new CoordsList<>(xyCoords));
        //CoordsWorkDemo.ShowXYZ(new CoordsList<>(xyCoords)); недотягивает - верхняя граница не позволяет использовать этот класс
        CoordsWorkDemo.ShowXY(new CoordsList<>(xyztCoords));
        CoordsWorkDemo.ShowXYZ(new CoordsList<>(xyztCoords));
        CoordsWorkDemo.ShowXYZT(new CoordsList<>(xyztCoords));

        //Generic interface
        GenericInterFaceImpl genericInterFace = new GenericInterFaceImpl();
        //genericInterFace.isDateOfMyBYear(new Object()); //npe
        //genericInterFace.isDateOfMyBYear(null); //dateTimeExp
        System.out.println("target date is equals to my bday: " +
                genericInterFace.isDateOfMyBYear(LocalDateTime.of(1992, 2, 21, 14, 0)));
    }

}

class CoordsList<T extends TwoDCoords>{
    T[] coords;

    public CoordsList(T[] coords){
        this.coords = coords;
    }
}

class CoordsWorkDemo{
    static void ShowXY(CoordsList<? extends TwoDCoords> c){
        for (TwoDCoords coord : c.coords){
            System.out.println("coord x is " + coord.x + ", y is " + coord.y);
        }
    }

    static void ShowXYZ(CoordsList<? extends ThreeDCoords> c){
        for (ThreeDCoords coord : c.coords){
            System.out.println("coord x is " + coord.x + ", y is "
                    + coord.y + ", z is " + coord.z);
        }
    }

    static void ShowXYZT(CoordsList<? extends FourDCoords> c){
        for (FourDCoords coord : c.coords){
            System.out.println("coord x is " + coord.x + ", y is "
                    + coord.y + ", z is " + coord.z + ", t is " + coord.t);
        }
    }
}

package org.example.enums;

public class BaseEnumTest {
    public static void main(String args[]){
        DefaultEnum val1 = DefaultEnum.VALUE1;
        DefaultEnum val2 = DefaultEnum.VALUE2;
        DefaultEnum val1Copy = DefaultEnum.VALUE1;
        DefaultEnum[] vals =  DefaultEnum.values();
        //vals
        for (DefaultEnum val : vals){
            System.out.println(val);
        }
        System.out.println(DefaultEnum.valueOf("VALUE1"));
        //System.out.println(DefaultEnum.valueOf("VALUE6")); // java.lang.IllegalArgumentException: No enum constant org.example.enums.DefaultEnum.VALUE6

        //ordinal
        for (DefaultEnum val : vals){
            System.out.println(val + " position is " + val.ordinal());
        }
        //comp
        if (val1 == DefaultEnum.VALUE1)
            System.out.println("is equals");
        else
            System.out.println("not equals");

        System.out.println("compare " + val1.name() + " to " + val2.name() + " is " +val1.compareTo(val2)); //- 1
        System.out.println("compare " + val1.name() + " to " + val1Copy.name() + " is " +val1.compareTo(val1Copy)); // 0
        System.out.println("compare " + val1.name() + " to " + DefaultEnum.VALUE1.name() + " is " +val1.compareTo(DefaultEnum.VALUE1)); // 0
        System.out.println("compare " + val1.name() + " to " + val1.name() + " is " +val1.compareTo(val1)); // 0
        System.out.println("compare " + val2.name() + " to " + val1.name() + " is " +val2.compareTo(val1)); // 1 val2.ordinal() > val1.ordinal()

        Object obj = new Object();
        System.out.println("equality " + val1.name() + " to " + val2.name() + " is " +val1.equals(val2)); //false
        System.out.println("equality " + val1.name() + " to " + val1Copy.name() + " is " +val1.equals(val1Copy)); //true
        System.out.println("equality " + val1.name() + " to " + DefaultEnum.VALUE1.name() + " is " +val1.equals(DefaultEnum.VALUE1)); //true
        System.out.println("equality " + val1.name() + " to " + val1.name() + " is " +val1.equals(val1)); //true
        System.out.println("equality " + val1.name() + " to " + obj.toString() + " is " +val1.equals(obj)); //equality VALUE1 to java.lang.Object@6e8cf4c6 is false
        obj = val1;
        System.out.println("equality " + val1.name() + " to " + obj.toString() + " is " +val1.equals(obj)); //equality VALUE1 to VALUE1 is true

        //switch usage
        switch (val1){
            case VALUE1 -> {
                System.out.println(DefaultEnum.VALUE1);
            }
            case VALUE2 -> {
                System.out.println(DefaultEnum.VALUE2);
            }
            case VALUE3 -> {
                System.out.println(DefaultEnum.VALUE3);
            }
            default -> System.out.println("None of them");
        }

        //parameters
        EnumParametrizedContctuctor checkhov = EnumParametrizedContctuctor.CHECKHOV;
        EnumParametrizedContctuctor vodolazkin = EnumParametrizedContctuctor.VODOLAZKIN;
        //getters
        System.out.println("Checkhov century is " + checkhov.getCentury()); //19
        System.out.println("Checkhov years starts " + checkhov.getCenturyInYears());
        System.out.println("Vodolazkin century is " + vodolazkin.getCentury()); // 0 - def value

    }
}

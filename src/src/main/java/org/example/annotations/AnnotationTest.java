package org.example.annotations;

public class AnnotationTest {

    @SimpleAnnotation(str = "test",val = 1)
    public void test(){
        System.out.println("Try to annotate me");
    }

    @SimpleAnnotationWithDefValue
    public void tryNotAnnotate(){
        System.out.println("Def value");
    }

    @MarkerAnnotation
    public void tryMarkerAnnotation(){

    }

    @SingleMemberAnnotation("HELLO MAN") // для одноэлементных можно указывать без имени, то есть value = опускается
    //@SingleMemberAnnotation(value = "HELLO MAN") // хотя и допустимо
    public void trySingleElementAnnotation(){

    }

    @Deprecated
    public void deprecatedTest(){

    }

    @SuppressWarnings(value = "i")
    public void suppressTest(){
        int i = 0;
    }
    @RepeatableAnnotation(str = "first try", val= 1)
    @RepeatableAnnotation(str = "second try", val= 2)
    public void repeatableTest(){

    }
}

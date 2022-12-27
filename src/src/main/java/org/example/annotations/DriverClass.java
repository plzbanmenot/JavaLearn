package org.example.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DriverClass {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationTest annotationTest = new AnnotationTest();
        var annotations = annotationTest.getClass().getAnnotations();
        var methodAnnotations = annotationTest.getClass().getMethods();
        for (Annotation annotation : annotations){
            System.out.println(annotation.toString());
        }
        for (Method method: methodAnnotations){
            if (method.getName().equals("test")){
                String val = ((SimpleAnnotation)method.getDeclaredAnnotations()[0]).str(); // test
                SimpleAnnotation[] simpleAnnotation = method.getAnnotationsByType(SimpleAnnotation.class);
                boolean annotated = method.isAnnotationPresent(SimpleAnnotation.class); // true
            }
            for (Annotation annotation : method.getAnnotations()){
                System.out.println(annotation.toString());
            }
        }
        //Marker annotation
        Method tryMarkerAnnotation = annotationTest.getClass().getMethod("tryMarkerAnnotation");
        boolean annotationPresent = tryMarkerAnnotation.isAnnotationPresent(MarkerAnnotation.class); //true

        annotationTest.deprecatedTest(); // пример вызова Deprecated

        //Repeatable
        Method repeatableTest = annotationTest.getClass().getMethod("repeatableTest");
        repeatableTest.getAnnotation(RepeatableAnnotation.class); // null
        repeatableTest.getAnnotation(RepeatableAnnotationContainer.class); //работает, возвращает контейнер
        RepeatableAnnotation[] repeatableAnnotations = repeatableTest.getAnnotationsByType(RepeatableAnnotation.class); // адекватное получение
    }
}

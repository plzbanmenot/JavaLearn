package org.example.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE)
public @interface SimpleAnnotation {
    String str();
    int val();
}

package org.example.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleAnnotationWithDefValue {
    String str() default "HELLO BITCH";
}

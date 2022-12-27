package org.example.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatableAnnotationContainer.class)
public @interface RepeatableAnnotation {
    String str();
    int val();
}

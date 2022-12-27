package org.example.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD}) // если убрать ElementType.METHOD - compile time error
@Inherited
public @interface SingleMemberAnnotation {
    String value();
}

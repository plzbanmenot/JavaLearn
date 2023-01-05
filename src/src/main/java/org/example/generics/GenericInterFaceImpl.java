package org.example.generics;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class GenericInterFaceImpl implements GenericInterface<Object>{


    @Override
    public boolean isDateOfMyBYear(Object d) throws NullPointerException, DateTimeException {
        if (d == null)
            throw new NullPointerException("Object is empty");
        if (!(d instanceof LocalDateTime))
            throw new DateTimeException("Object in not LocalDateTimeType");
        return myBday.equals(d);
    }
}

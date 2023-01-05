package org.example.generics;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public interface GenericInterface <T>{
    LocalDateTime myBday = LocalDateTime.of(1992, 2, 21, 14, 0);
    boolean isDateOfMyBYear(T d) throws NullPointerException, DateTimeException;
}

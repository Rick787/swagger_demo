package com.rick.demologicweb.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME )
public @interface Schedule {

    int dayOfWeek() default 1;
    int hourOfDay() default 10;
}

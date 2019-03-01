package com.rick.demologicweb.controller;

public class personImpl implements person {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Schedule(dayOfWeek = 3, hourOfDay = 20)
    public void sayHi() {
        System.out.println("aaa");
    }
}

package com.rick.demologicweb.controller;

public interface person {

    default void getname(String name){
        System.out.println(name);
    }

    void run();

    static void sayhello(){
        System.out.println("hello there");
    }
}

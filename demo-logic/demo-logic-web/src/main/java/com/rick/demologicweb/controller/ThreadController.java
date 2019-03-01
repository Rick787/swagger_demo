package com.rick.demologicweb.controller;

public class ThreadController extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("thread run |" + Thread.currentThread().getName()+"| "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "开始线程");
        ThreadController t1 = new ThreadController();
        ThreadController t2 = new ThreadController();
        ThreadController t3 = new ThreadController();
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName() + "结束线程");
    }


}

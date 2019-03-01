package com.rick.demologicweb.TestClasses;

import java.util.ArrayList;
import java.util.List;

public class TestController {

    public static void main(String[] args) {
        test3();
    }

    public static void test1(){
        //7.
        String[] names = new String[]{"1","2","3","4"};
        //放入成员名字
        System.out.println("第一个人："+names[0]);
        System.out.println("最后一个人："+names[names.length-1]);


        //8.
        int[] scores = new int[]{92,93,94,95};
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        System.out.println(totalScore);
    }

    public static void test2(){
        switch (2){
            case 1:
                System.out.println("Test1");
            case 2:
            case 3:
                System.out.println("TEST2");break;
                default:
                    System.out.println("haha");
        }
    }

    public static void test3(){
        int count = 0;
        while (true){
            try {
                if (count++ == 1){
                    throw new Exception1();
                }
                if (count == 2){
                    throw new Exception2();
                }
                System.out.println("no catch");
            }catch (Exception1 exception1){
                System.out.println("catch exc1");
                break;
            }catch (Exception2 exception2) {
                System.out.println("catch exc2");
            }finally {
                System.out.println("finally called");
            }
        }
    }
}

package com.rick.demologicweb.TestClasses;

import java.util.Scanner;

public class WordsReversion {

    public static void main(String[] args) {
        System.out.println("请输入要转换的单词");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        WordsReverse(s);
    }

    public static void WordsReverse(String word){
        String[] split = word.split(" ");
        for (int i = 0; i < split.length; i++) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(split[i]);
            split[i] =  buffer.reverse().toString();
            if (i == split.length-1){
                System.out.print(split[i]);
            }else {
                System.out.print(split[i]+" ");
            }
        }
    }

}

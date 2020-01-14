package com.sv.lab1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Welcome to Java 2020");
        System.out.println("How many numbers you need to print:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0; i<=num;++i){
            System.out.println("Numbers: "+i);
        }
    }
}

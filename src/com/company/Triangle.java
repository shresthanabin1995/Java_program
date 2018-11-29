package com.company;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle of triangle:");
        int a = sc.nextInt();
        System.out.println("Enter second angle of triangle:");
        int b = sc.nextInt();
        System.out.println("Enter third angle of triangle:");
        int c = sc.nextInt();
        if(a+b+c==180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not Valid triangle");
        }

    }
}

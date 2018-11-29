package com.company;
import java.util.Scanner;
public class Maximum {
    //Program to find maximum between three numbers...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number::");
        int a = sc.nextInt();
        System.out.println("Enter Second Number::");
        int b = sc.nextInt();
        System.out.println("Enter Third Number::");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("The maximum between three numbers is::" + a);
            } else {
                System.out.println("The maximum between three numbers is::" + c);
            }

        } else {
            if (b > c) {
                System.out.println("The maximum between three numbers is::" + b);
            } else {
                System.out.println("The maximun between three numbers is::" + c);
            }
        }
    }}
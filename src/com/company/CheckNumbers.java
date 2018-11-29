package com.company;
import java.util.Scanner;
public class CheckNumbers {
    //Program to check whether a number is negative,positive or Zero.......
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers::");
        int a = sc.nextInt();
        if(a>0) {
            System.out.println("The Positive numbers");
        }if(a<0){
            System.out.println("The Negative numbers");
        }if(a==0){
            System.out.println("The Zero numbers");
        }
    }
}

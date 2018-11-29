package com.company;
import java.util.Scanner;
public class Main {
    //Program to find maximum between two numbers...
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number::");
        int a = sc.nextInt();
        System.out.println("Enter Second Number::");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The maximum between two numbers is::" +a);
        }else{
            System.out.println("The maximum between two numbers is" +b);
        }

    }
}

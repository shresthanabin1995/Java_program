package com.company;
import java.util.Scanner;
public class MaxNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your question number::");
        int questionnumber = sc.nextInt();
        switch (questionnumber) {
            case 1:
                Scanner one = new Scanner(System.in);
                System.out.println("Enter First Number::");
                int x = one.nextInt();
                System.out.println("Enter Second Number::");
                int y = one.nextInt();
                if(x>y){
                    System.out.println("The maximum between two numbers is::" +x);
                }else{
                    System.out.println("The maximum between two numbers is" +y);
                }
              break;
        case 2:
        Scanner two = new Scanner(System.in);
        System.out.println("Enter First Number::");
        int a = two.nextInt();
        System.out.println("Enter Second Number::");
        int b = two.nextInt();
        System.out.println("Enter Third Number::");
        int c = two.nextInt();
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
            } }
        break;
        default:
                System.out.println("Please enter valid question number");

        }
    }
}

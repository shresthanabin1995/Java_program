package com.company;
import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number::");
        int day = sc.nextInt();
        if(day==1){
            System.out.println("Sunday");
        }if(day==2){
            System.out.println("Monday");
        }if(day==3){
            System.out.println("Tuesday");
        }if(day==4){
            System.out.println("Wednesday");
        }if(day==5){
            System.out.println("Thursday");
        }if(day==6){
            System.out.println("Friday");
        }if(day==7){
            System.out.println("Saturday");
        }if(day>7){
            System.out.println("Invalid week number");
        }

    }
}

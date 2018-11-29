package com.company;
import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number::");
        int month = sc.nextInt();
        if(month==1){
            System.out.println("The number of days in January is 31");
        }
        if(month==2){
            System.out.println("The number of days in February is 29");
        }
        if(month==3){
            System.out.println("The number of days in March is 30");
        }if(month==4){
            System.out.println("The number of days in April is 31");
        }
        if(month==5){
            System.out.println("The number of days in May is 30");
        }
        if(month==6){
            System.out.println("The number of days in June is 31");
        }if(month==7){
            System.out.println("The number of days in July is 30");
        }
        if(month==8){
            System.out.println("The number of days in August is 31");
        }
        if(month==9){
            System.out.println("The number of days in September is 30");
        }if(month==10){
            System.out.println("The number of days in October is 31");
        }
        if(month==11){
            System.out.println("The number of days in November is 30");
        }
        if(month==12){
            System.out.println("The number of days in December is 31");
        }if(month>12){
            System.out.println("You enter invalid month number");
        }
    }
}

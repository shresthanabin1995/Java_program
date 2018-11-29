package com.company;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year you want");
        int year = sc.nextInt();
        if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
            System.out.println("Given is a Leap Year" +year);
        }
        else {
            System.out.format("Given is NOT a Leap Year"+year);
        }
    }
}

package com.company;
import  java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                || ch == 'I' || ch == 'o' || ch == 'O' || ch =='u' ||ch == 'U'){
            System.out.println("This is vowel:");
        }else{
            System.out.println("This is not vowel");
        }
    }
}

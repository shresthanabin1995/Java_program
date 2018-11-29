package com.company;
import java.util.Scanner;
public class UpperLowerCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character:");
        char ch = sc.next().charAt(0);
        if(ch>='a' &&  ch<='z'){
            System.out.println("Enter character is in Lower Case");
        } if (ch>='A'&& ch<='Z'){
            System.out.println("Enter character is in Upper Case");
        }
        }
}

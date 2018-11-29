package com.company;
import java.util.Scanner;
public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character:");
        char ch = sc.next().charAt(0);
        if((ch>='a' &&  ch<='z')|| ch>='A'&& ch<='Z'){
            System.out.println("Enter character is alphabet::" +ch);
        }else if(ch>='0' && ch<='9'){
            System.out.println("Enter character is digit::" +ch);
        }else {
            System.out.println("Enter character is special character::" +ch);
        }
    }
}

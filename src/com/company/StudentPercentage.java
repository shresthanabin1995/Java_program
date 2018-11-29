package com.company;
import java.util.Scanner;
public class StudentPercentage<percentage>
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks Obtained in physics:");
        int physics = sc.nextInt();
        System.out.println("Enter marks obtained in chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("Enter marks obtained in Biology:");
        int biology = sc.nextInt();
        System.out.println("Enter marks obtained in Mathematics:");
        int mathematics = sc.nextInt();
        System.out.println("Enter marks obtained in Computer:");
        int computer = sc.nextInt();
        float percentage =((physics+chemistry+biology+mathematics+computer)/5)*100;
       if(percentage>=90){
           System.out.println("Grade A:");
       }else if(percentage>=80){
           System.out.println("Grade B");
       }else if(percentage>=70){
           System.out.println("Grade C");
       }else if(percentage>=60){
           System.out.println("Grade D");
       }else if(percentage>=40){
           System.out.println("Grade E");
       }else{
           System.out.println("Grade F");
       }
    }
}

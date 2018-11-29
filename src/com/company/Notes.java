package com.company;
import java.util.Scanner;
public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount::");
        int amount = sc.nextInt();
        if(amount>=1000){
            int thousandcount = amount/1000;
            amount= amount-thousandcount*1000;
            System.out.println("ThousandCount");
        }if(amount>=500){
            int fivehundredcount = amount/500;
            amount = amount-fivehundredcount*500;
            System.out.println("FivehundredCount");
        }if(amount>=100){
            int hundredcount  = amount/100;
            amount = amount-hundredcount*100;
            System.out.println("HundredCount");
        }if(amount>=50){
            int fiftycount = amount/50;
            amount = amount-fiftycount*50;
            System.out.println("FityCount");
        }if(amount>=20){
             int twentycount= amount/20;
             amount= amount-twentycount*100;
            System.out.println("TwentyCount");
        }if(amount>=10){
            int tencount  = amount/10;
            amount = amount-tencount*10;
            System.out.println("TenCount");
        }if(amount>=5){
            int fivecount  = amount/5;
            amount = amount-fivecount*5;
            System.out.println("FiveCount");
        }if(amount>=2){
            int twocount  = amount/2;
            amount = amount-twocount*2;
            System.out.println("TwoCount");
        }if(amount>=1){
            int onecount  = amount/1;
            amount = amount-onecount*1;
            System.out.println("oneCount");
        }


    }
}

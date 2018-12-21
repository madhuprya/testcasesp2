package com.stackroute.p1assign;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int total;
        System.out.println("Enter a number: ");
        int number =sc.nextInt();
        total=number;
        if(number==0){
            System.out.println("input number is not an integer.");
        }else{
            while(number!=0){
                number=sc.nextInt();
                    total+=number;
            }
        }
        System.out.println(total);
    }
}

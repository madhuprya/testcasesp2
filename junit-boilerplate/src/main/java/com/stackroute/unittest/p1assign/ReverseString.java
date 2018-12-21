package com.stackroute.p1assign;

import java.util.Scanner;

public class ReverseString {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}

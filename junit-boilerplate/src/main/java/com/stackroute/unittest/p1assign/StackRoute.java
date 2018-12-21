package com.stackroute.p1assign;

import java.util.Scanner;

public class StackRoute {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        int range=sc.nextInt();
        String str=string;
        String rangestring=str.substring(str.length()-range);
        System.out.println(rangestring);
        for(int i=0;i<range;i++){
            string+=rangestring;
        }
        System.out.println(string);
    }
}

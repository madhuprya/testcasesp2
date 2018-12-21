package com.stackroute.unittest.p1assign;

import java.util.Scanner;

public class FindByAscii {
    public String asciiChar(){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        String result="";
        if(c>=65 && c<=90)
        {
            result="Capital letter";
        }
        else if(c>=95 && c<=122)
        {
            result="Small letter";
        }
        else if(c>=48 && c<=57)
        {
            result="Digit";
        }
        else if((c>=33 && c<=47)||(c>=58 && c<=64)){
            result="Special Character";
        }
        return result;
    }
}

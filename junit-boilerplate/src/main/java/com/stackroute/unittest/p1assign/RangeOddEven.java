package com.stackroute.unittest.p1assign;

import java.util.Scanner;

public class RangeOddEven {
    public String oddeven(int num){
        String result="";
        if(num>20 && num<30){
            if(num%2==0)
            {
                result="Tom";
            }
            else{
                result="Jerry";
            }
        }
        return result;
    }
}

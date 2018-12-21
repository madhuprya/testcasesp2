package com.stackroute.unittest.p1assign;

import java.util.Scanner;

public class Palindrome {
    public  String palindromeCheck(int num){
        int temp=num,temp1=num,sum=0, even=0,rem=0,erem=0;
        String result="";
        while(temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(sum==num){

                    while(temp1>0){
                        erem=temp1%10;
                        if(erem%2==0)
                        {
                            even+=erem;
                        }
                        temp1=temp1/10;
                    }
                    if(even>25){
                        result = num+" is a palindrome and the sum of even numbers is greater than 25";}
                    else{
                       result= num+" is a palindrome and the sum of even numbers is less than 25";}

        }
        else {
            result = num+" is not a palindrome";
        }
        return result;
    }
}

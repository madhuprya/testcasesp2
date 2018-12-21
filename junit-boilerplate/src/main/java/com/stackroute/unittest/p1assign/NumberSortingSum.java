package com.stackroute.p1assign;

import java.util.Scanner;

public class NumberSortingSum {
    public static void main(String s[])
    {   int rem=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number: ");
        int number=sc.nextInt();
        int size=Integer.toString(number).length();
        int numberarray[]=new int[size];
        int i=size-1;
            while(number!=0)
            {
                rem=number%10;
                    numberarray[i] = rem;
                   // System.out.println(numberarray[i]);
                    i--;
                number=number/10;
            }
           for(int j=0;j<size;j++)
            {
                for(int k=j+1;k<size;k++){
                    if(numberarray[j]<=numberarray[k]){
                        int temp=numberarray[k];
                        numberarray[k]=numberarray[j];
                        numberarray[j]=temp;
                    }
                }
            }
           for(int m=0;m<size;m++){

               if(numberarray[m]%2==0)
               {
                   sum+=numberarray[m];
               }
               System.out.print(numberarray[m]);

           }
           if(sum>15){
               System.out.print("True");
           }
           else{
               System.out.print("False");
           }

    }
}

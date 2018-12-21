package com.stackroute.unittest.p1assign;

import java.util.Scanner;

public class NumberIteration {
    public static int[] numberIteration(int range,int length){
        int k=0;
        int[] iterationnumber=new int[length];

        for(int i=1;i<=range;i++){
            for(int j=1;j<=i;j++)
            {
                iterationnumber[k++]=i;

            }

        }
        return iterationnumber;
    }
}

package com.stackroute.unittest.p1assign;

import java.util.Scanner;

public class Alphabt {
    public String alphabetType(String words ){
        String result="";
        char []vowel={'a','e','i','o','u','A','E','I','O','U','a'};
      /*  for(int k=0; k<words.length() ; k++){*/
            int k=0, j=0;
        while(k<words.length()) {
            if((words.charAt(k)>=65 && words.charAt(k)<=90)|| (words.charAt(k)>=97 && words.charAt(k)<=122)) {
                while ((words.charAt(k) >= 65 && words.charAt(k) <= 90) || (words.charAt(k) >= 97 && words.charAt(k) <= 122)) {
                    if (words.charAt(k) == vowel[j]) {
                        result += "Vowel";
                        ++k;
                        j = 0;
                        break;

                    } else if (j < vowel.length - 1 && words.charAt(k) != vowel[j]) {
                        j++;
                        break;
                    } else  {
                        result += "Consonant";
                        ++k;
                        j = 0;
                        break;
                    }

                }
            }
            else{
                result="invalid String";
                break;
            }

        }
        /* }*/
        return result;
    }

}

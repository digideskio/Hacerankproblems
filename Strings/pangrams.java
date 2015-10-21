Problem Statement

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format Input consists of a line containing s.

Constraints 
Length of s can be at most 103 (1=|s|=103) and it may contain spaces, lower case and upper case letters. Lower case and upper case instances of a letter are considered the same.

Output Format Output a line containing pangram if s is a pangram, otherwise output not pangram.



Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
       
        String input= scan.nextLine();
        /*if(input.length()==1)
         {
            
         }   
        else
        {
            input=input.replaceAll("\\s","");
        }*/
        
        String result=ispangram(input);
        System.out.println(result);
    }



    public static String ispangram(String s)
       { 
        char[] charArray= s.toCharArray();
        int len=s.length();
        if(len<26 && len==1)
        {
            return "not pangram";
        }    
        else{
        for (char c='A';c<='Z';c++)
        {
            if((s.indexOf(c)<0) && (s.indexOf((char)(c+32))<0))
               return "not pangram";
        
            
             
            
        }  
        
        return "pangram";
        }
           
            
        }       
     
        
          }

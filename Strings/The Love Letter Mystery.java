Problem Statement

James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer T, i.e., the number of test cases. 
The next T lines will contain a string each. The strings do not contain any spaces.

Constraints 
1=T=10 
1= length of string =104 
All characters are lower case English letters.


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t =sc.nextInt();
      String[] S=new String[t+1];
      for(int i=0;i<t;i++)
      {
          S[i]=sc.next();
          int count =ispalindrome(S[i]);
          System.out.println(count);
          
      }
    }
    public static int ispalindrome(String s)
    {
        int l=s.length();
        char[] ch=new char[l];
        ch=s.toCharArray();
        int i=0;
        int j=l-1;
        int count=0; 
        while(i<j)
        {
            if(ch[i]!=ch[j])
              {  
                int counte=Math.abs(ch[i]-ch[j]);
                count=counte+count;
              }       
            i++;
            j--;
        }
        
        
        return count;
        
    }
}
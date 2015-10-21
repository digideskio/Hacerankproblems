Problem Statement

Chinese Version
Russian Version

Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format 
Two lines each containing a string.

Constraints 
1 <= Length of A,B <= 10000 
A and B will only consist of lowercase latin letter.

Output Format 
A single integer which is the number of character deletions.


Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       String[] S= new String[3];
       Scanner sc=new Scanner(System.in);
       S[1]=sc.nextLine();
       S[2]=sc.nextLine();
       int del=0;
       int del1=0;
       int del2=0; 
       int[] freq1 =new int[27];
       int[] freq2 =new int[27]; 
       Arrays.fill(freq1,0);
       Arrays.fill(freq2,0);
       for(char c='a';c<='z';c++)
       {
           if(S[1].indexOf(c)>=0)
               freq1[c-'a']++;
           if(S[2].indexOf(c)>=0)
               freq2[c-'a']++;
       }
       for(int i=0;i<26;i++)
       {    
           
        if(freq1[i]!=0 && freq2[i]!=0)
           del=Math.abs(freq1[i]-freq2[i])+del;
       }
       if(S[1].length()==S[2].length())
       {
          del=2*( del);
       }    
       else
       {
           del1=S[1].length()-del;
           del2=S[2].length()-del;
           del=del1+del2;
       }    
        
       System.out.println(del);
    }
}
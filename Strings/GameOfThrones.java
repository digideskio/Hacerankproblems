Problem Statement

Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

door

But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out whether any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string.

Constraints 
1= length of string =105 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//import com.google.common.annotations.GwtCompatible;

import java.util.Collection;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       int[] letters= new int[256];
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
   char[] ch = inputString.toCharArray();
        for(char c: ch)
         {
            letters[c-'a']++;
        }   
        int len =inputString.length();
        int count=0;
        int coun=0;
        int l = letters.length;
  if(len%2==0)
  {
      
      for(int i=0;i<l; i++)
      {
          if(letters[i]%2==0)
          {
              count++;
          }    
      }  
      
      if(count==l  )
      {
          ans="YES";
          System.out.println(ans);
      }    
       else
       {
           ans="NO";
           System.out.println(ans);
       } 
  }  
         
        if(len%2==1)
        {
            
      for(int i=0;i<l; i++)
      {
          if(letters[i]%2==0)
          {
              count++;
          }  
          if(letters[i]%2==1)
          {
              coun++;
          }    
      }  
               
       if((count==l-1) && (coun==1))
              {
                ans="YES";
                System.out.println(ans);
            }  
            
            else
             {
                ans="NO";
                System.out.println(ans);
            }
        }    
        
             
                 
         
       
        
        myScan.close();
    }
}
Problem Statement

Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28? five o' clock? one minute past five? ten minutes past five? half past five? twenty minutes to six? quarter to six? thirteen minutes to six? twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1=H<12
0=M<60
Output Format

Display the time in words.


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hh=sc.nextLine();
        int h=Integer.parseInt(hh);
        String mm=sc.nextLine();
        String s1=null;
        String s2="to";
        String s3=null;
        String key=null;
        int m=Integer.parseInt(mm);
        s1=casehour(h);
        if(m>30)
        {
            h=h+1;
            s1=casehour(h);
            m=60-m;
            s3=casehour(m);
            
            if(s1.equals("one"))
            {
                key="minute";
                
            }   
        
            else
            {
                key="minutes";
            }    
            if(s3.equals("quarter"))
            {    
                  System.out.println(s3+" "+s2+" "+s1);
     
            }
            else
            {
                System.out.println(s3+" "+key+" "+s2+" "+s1);
                
            }    
            
        }    
        
        
        else if(m==0)
        {
           
            key="o' clock";
            System.out.println(s1+" "+key);
        }    
        else if(m==30)
        {
            
            key="half past";
            System.out.println(key+" "+s1);
        }
        else if(m>=1 && m<30)
        {
            s3=casehour(m);
            if(s1.equals("one"))
            {
                key="minute";
                
            }   
            else
            {
                key="minutes";
            }    
            
            s2="past";
            if(s3.equals("quarter"))
            {    
                 System.out.println(s3+" "+s2+" "+s1);
           
            }   
            else
            {
                 System.out.println(s3+" "+key+" "+s2+" "+s1);
            }    
        }    
        
    }
    
   
     
    public static String casehour(int h)
    {
        String s1=null;
         switch(h)
            {
                case 1:
                     s1="one ";
                     return(s1);
                     
                case 2:
                     s1="two";
                     return(s1);
                     
                case 3:
                     s1="three";
                     return(s1);
                case 4:
                     s1="four";
                      return(s1);
                case 5:
                     s1="five";
                      return(s1);
                case 6:
                     s1="six";
                      return(s1);
                case 7:
                     s1="seven";
                      return(s1);
                 case 8:
                     s1="eight";
                      return(s1);
                case 9:
                     s1="nine";
                      return(s1);
                case 10:
                     s1="ten";
                      return(s1);
                case 11:
                     s1="eleven";
                      return(s1);
                case 12:
                     s1="twelve";
                      return(s1);
                case 13:
                     s1="thirteen";
                      return(s1);          
                case 14:
                     s1="fourteen";
                      return(s1);
                case 15:
                     s1="quarter";
                      return(s1);
                case 16:
                     s1="sixteen";
                      return(s1);
                case 17:
                     s1="seventeen";
                      return(s1);
                case 18:
                     s1="eighteen";
                     return(s1); 
                case 19:
                     s1="nineteen";
                      return(s1);
                case 20:
                     s1="twenty";
                      return(s1);
                case 21:
                     s1="twenty one";
                      return(s1);
                case 22:
                     s1="twenty two";
                      return(s1);
                case 23:
                     s1="twenty three ";
                      return(s1); 
                case 24:
                     s1="twenty four";
                      return(s1);
                case 25:
                     s1="twenty five";
                      return(s1);
                case 26:
                     s1="twenty six";
                      return(s1);
                case 27:
                     s1="twenty seven";
                      return(s1);
                case 28:
                     s1="twenty eight";
                      return(s1);  
                case 29:
                      s1="twenty nine";
                      return(s1);
 
            }
            return null;
    
    }    
}
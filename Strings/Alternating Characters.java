Problem Statement

Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1=T=10 
1= length of string =105
Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB



Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
       
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

//System.out.println("Enter number of patterns:");
int t = scan.nextInt();
        
//subpattern=scan.nextString();
//System.out.println("Enter patterns:");
for(int i = 1; i <=t; i++)
{
             String subpattern =  scan.next();
            //System.out.println(subpattern);
            char[] ch =subpattern.toCharArray();
            int l= ch.length;
            //System.out.println(l);
            int counta=0;
            int countb=0;
            int count=0;
            for(int j=0;j<l-1;j++)
            {
                
                if(subpattern.charAt(j)==subpattern.charAt(j+1))
                    count++;
               /* if(ch[j]=='A')
                {
                    if(ch[j+1]=='A')
                    {
                        counta=counta + 1;
                    }  
                 //System.out.println(counta);   
                    
                }   
                if(ch[j]=='B')
                {
                    if(ch[j+1]=='B')
                    {
                        countb=countb + 1;
                    }  
                   //System.out.println(countb);    
                    
                } 
            }
           //System.out.println(counta);
           //System.out.println(countb);
           */
    //count= counta + countb;
            }
            System.out.println(count);    
             
         
        
        
        
            
   }
        
             
    } 
    
}
        
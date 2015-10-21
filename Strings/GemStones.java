Problem Statement

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, N, the number of rocks. 
Each of the next N lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
1=N=100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1= length of each composition =100


Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    
    public static void main(String[] args) throws Exception
    { 
        String[] S;
        int n;
        int count=0;
        int lenc=0;
        Boolean[] gemistrue= new Boolean[27];
        Arrays.fill(gemistrue, Boolean.TRUE);
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        S=new String[n+1];
        for(int i=0;i<n;i++)
        {S[i]=in.next();}
        for(int i=0;i<n;i++)
        {   
           for (char c='a';c<='z';c++)
           { 
                int length=S[i].length();
                if((S[i].indexOf(c)>=0 && gemistrue[c-'a']==true ))
                  {   
                    gemistrue[c-'a']=true;
                    
                  }
                else
                    {  
                       
                       gemistrue[c-'a']=false;
                       
                       
                    }
           }
             
        }
        
        for(int i=0;i<26;i++)
        {
            if(gemistrue[i]==true)
                count=count+1;
        } 
        
            System.out.println(count);      
        }
}
          
    
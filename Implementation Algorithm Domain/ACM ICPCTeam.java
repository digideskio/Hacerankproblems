Problem Statement

You are given a list of N people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.

Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.

Input Format

The first line contains two integers, N and M, separated by a single space, where N represents the number of people, and M represents the number of topics. N lines follow.
Each line contains a binary string of length M. If the ith line's jth character is 1, then the ith person knows the jth topic; otherwise, he doesn't know the topic.

Constraints 
2=N=500 
1=M=500


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String S=null;
        S=sc.nextLine();
        String[] input=S.split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        String[] teams=new String[n];
        int i=0;
        int j=0;
        int k=0;
        int e=0;
        int previouscount=0;
        Hashtable<Integer,Integer> hs1=new Hashtable<Integer,Integer>();
        for(i=0;i<n;i++)
        {
            teams[i]=sc.nextLine();
            
        }   
        
        for(i=0;i<n-1;i++)
        {
            
            for(j=i+1;j<n;j++)
            {
                int count=0;
                for(k=0;k<m;k++)
                {
                   
                    if((teams[i].charAt(k)=='1') || (teams[j].charAt(k)=='1'))
                    {
                        count=count+1;
                    }    
                }
                e=e+1;
                
                if(e==1)
                {
                    previouscount=count;
                    
                }    
                if(e>1)
                {
                    
                    if(count>previouscount)
                    {
                        previouscount=count;
                        hs1.clear();
                        hs1.put(i,j);
                    }  
                    else if(count==previouscount)
                    {
                        hs1.put(i,j);
                    }    
                }    
                
            }    
        } 
        System.out.println(previouscount);
        System.out.println(hs1.size());
       
        
    }     
        
    
}
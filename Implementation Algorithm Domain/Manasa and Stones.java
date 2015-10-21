Problem Statement

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format 
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Output Format 
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints 
1=T=10 
1=n,a,b=103


Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {    
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            for(int j=1;j<=n;j++)
            {
              if(a<b)
              {    
                int p=  a*(n-j)+b*(j-1);
                System.out.print(p+" ");
              }
              if(b<a)
              { 
                int p=  b*(n-j)+a*(j-1);
                System.out.print(p+" ");
              }
              if(a==b && count==0)
              {
                  int p=b*(n-j)+a*(j-1);
                  System.out.print(p+"");
                  count=1;
              }    
            }
            System.out.println();
        }
        
    }
}
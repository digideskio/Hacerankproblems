Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains T, the number of test cases. T test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting A and B.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1=T=100 
1=A=B=


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
       for(int j=0;j<t;j++)
       {
           
           String s1=sc.next();
           String s2=sc.next();
           int n1=Integer.parseInt(s1);
           int n2=Integer.parseInt(s2);
           int count=0;
           for(int i=1;i<n2;i++)
             {
                  int square=i*i;
                  if(square>=n1 && square<=n2)
                  {
                      count=count+1;
                  }    
                  if(square>n2)
                  {
                      break;
                  }
             } 
           System.out.println(count);
       }
    }
}
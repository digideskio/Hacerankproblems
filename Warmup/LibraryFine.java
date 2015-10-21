Problem Statement

The Head Librarian at a library wants you to make a program that calculates the fine for returning the book after the return date. You are given the actual and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date, no fine will be charged, in other words fine is 0.
If the book is returned in the same calendar month as the expected return date, Fine = 15 Hackos � Number of late days
If the book is not returned in the same calendar month but in the same calendar year as the expected return date, Fine = 500 Hackos � Number of late months
If the book is not returned in the same calendar year, the fine is fixed at 10000 Hackos.
Input Format

You are given the actual and the expected return dates in D M Y format respectively. There are two lines of input. The first line contains the D M Y values for the actual return date and the next line contains the D M Y values for the expected return date.

Constraints 
1=D=31 
1=M=12 
1=Y=3000
Output Format

Output a single value equal to the fine.

Sample Input

9 6 2015
6 6 2015
Sample Output

45
Explanation

Since the actual date is 3 days later than expected, fine is calculated as 15�3=45 Hackos.

Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String dd1=sc.next();
       String mm1=sc.next();
       String yy1=sc.next();
       String dd2=sc.next();
       String mm2=sc.next();
       String yy2=sc.next();
       int y1=Integer.parseInt(yy1);
       int y2=Integer.parseInt(yy2);
       int m1=Integer.parseInt(mm1);
       int m2=Integer.parseInt(mm2);
       int d1=Integer.parseInt(dd1);
       int d2=Integer.parseInt(dd2);
       int hackos=0;
       if(y2<y1)
         {
             hackos=10000;
             System.out.println(hackos);
                
         }  
        else if(y1==y2)
         {
            if(m1>m2)
            {
              hackos=(m1-m2)*500;    
              System.out.print(hackos);
             
            } 
            else if(m1==m2)
            {
                if(d1>d2)
                {    
                    hackos=(d1-d2)*15;
                    System.out.println(hackos);
                    
                }
                else
                  { 
                    hackos=0;
                    System.out.println(hackos);
                  }
                    
            }
            else
             {
                hackos=0;
                System.out.println(hackos);
            }   
        }
        else
        {
            hackos=0;
            System.out.println(hackos);
        }
       
    }   
      
    }

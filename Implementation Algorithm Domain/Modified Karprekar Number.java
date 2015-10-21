A modified Kaprekar number is a positive whole number n with d digits, such that when we split its square into two pieces - a right hand piece r with d digits and a left hand piece l that contains the remaining d or d-1 digits, the sum of the pieces is equal to the original number (i.e. l + r = n).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers p and q, where p is lower than q. Write a program to determine how many Kaprekar numbers are there in the range between p and q (both inclusive) and display them all.

Input Format

There will be two lines of input: p, lowest value q, highest value

Constraints: 
0<p<q<100000


Solution:


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        long i=0;
        String S=null;
        String substring1=null;
        String substring2=null;
        long square=0;
        int fsquare=0;
        int ssquare=0;
        int sum=0;
        int v=0;
        for(i=p;i<=q;i++)
        {
           square=squar(i);
           S=Long.toString(square);
           
           if(square<=9)
           {   S=0+S; }
           int length=S.length();
           int d=length/2;
           String lsquare=S.substring(0,d);
           String rsquare=S.substring(d);
           fsquare=Integer.parseInt(lsquare);
           ssquare=Integer.parseInt(rsquare);
           sum=fsquare+ssquare;
           if(sum==i)
           {
               System.out.print(i);
               System.out.print(" ");
               v=1;
           }    
        }    
        if(v==0)
        {
            System.out.print("INVALID RANGE");
        }    
        
    }
    public static long squar(long n)
    {
        return n*n;
    }    
}
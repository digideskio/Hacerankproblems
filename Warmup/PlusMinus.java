Problem Statement

You're given an array containing integer values. You need to print the fraction of the count of positive numbers, negative numbers and zeroes to the total numbers. Print the value of the fractions in decimal form corrected to 3 decimal places.

Input Format

The first line contains N: the size of the array. 
The next line contains N space separated integers A1,A2,A3,?,AN.

Constraints 
1=N=100 
-100=Ai=100
Output Format

Output the three values each on a different line equal to the fraction of the count of positive numbers, negative numbers and zeroes to the total numbers respectively. Correct the fraction to 3 decimal places.

Sample Input

6
-4 3 -9 0 4 1     


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        int ncount=0;
        int pcount=0;
        int zcount=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>0)
                pcount=pcount+1;
            else if(a[i]<0)
                ncount=ncount+1;
            else
                zcount=zcount+1;
        }
        
       
       
        
        double pcountf=(double)(pcount)/(double)(n);
        double ncountf=(double)(ncount)/(double)(n);
        double zcountf=(double)(zcount)/(double)(n);
        System.out.println(BigDecimal.valueOf(pcountf));
        System.out.println(BigDecimal.valueOf(ncountf));
        System.out.println(BigDecimal.valueOf(zcountf));
    }
}
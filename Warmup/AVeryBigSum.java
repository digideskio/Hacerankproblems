Problem Statement

You are given an array of integers of size N. You need to print the sum of the elements in the array.

Note: The range of the 32-bit integer is (-231) to (231-1) or [-2147483648,2147483647].
When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.

Input Format

The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

Constraints 
1=N=10 
0=A[i]=1010

Output Format

Output a single value equal to the sum of the elements in the array.

Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005

Solution

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       BigInteger[] a=new BigInteger[n+1];
       BigInteger sum=BigInteger.ZERO;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextBigInteger();
           sum=sum.add(a[i]);
       }
       System.out.println(sum);
    }
}
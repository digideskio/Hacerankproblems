Problem Statement

You are given an array of integers of size N. You need to print the sum of the elements in the array.

Input Format 
The first line of input consists of an integer N. The next line contains N space-separated integers contained inside the array.

Constraints 
1=N=1000 
0=A[i]=1000

Output Format 
Output a single value equal to the sum of the elements in the array.

Sample Input

6
1 2 3 4 10 11

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
        int n= sc.nextInt();
        int sum=0;
        int[] a= new int[n+1];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
Problem Statement

You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

Input Format

The first line contains a single integer N. The next N lines contain the rows of N integers describing the matrix.

Constraints 
1=N=100 
-100=A[i]=100
Output Format

Output a single integer equal to the absolute difference in the sums across the diagonals.

Sample Input

3
11 2 4
4 5 6
10 8 -12


Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sumd1=0;
      int sumd2=0;
      int[][] a =new int[n+1][n+1];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              a[i][j]=sc.nextInt();
              if(i==j)
                sumd1=sumd1+a[i][j];            
          }     
      }
      for(int i=0,j=n-1;i<n;i++,j--)
      {
            
          sumd2=sumd2+a[i][j];
                 
          
      }
      int sum=Math.abs(sumd1-sumd2);  
      System.out.println(sum);
    }      
}
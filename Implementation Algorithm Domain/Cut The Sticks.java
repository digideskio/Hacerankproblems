Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8
Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6
The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 = N = 1000 
1 = ai = 1000

Sample Input #00

6
5 4 4 2 2 8
Sample Output #00

6
4
2
1
Sample Input #01


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
       int e=0;
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           
       }
        Arrays.sort(a);
        int first=0;
        int t=1;
        int count=0;
       while(t!=0) 
       {    
           for(int k=0;k<n;k++)
            {
                if(a[k]!=0)
                {    
                    first=a[k];
                    break;
                }
            }
            
            count=0;
            for(int j=0;j<n;j++)
            {    
                   if(a[j]!=0)
                   {    
                       a[j]=a[j]-first;
                       count=count+1;
                   }           
            }
            if(count==0)
            {
               t=0; 
            }    
            else
             System.out.println(count);
           
       }
            
       
    }
}
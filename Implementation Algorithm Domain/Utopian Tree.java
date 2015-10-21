Problem Statement

The Utopian Tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.

Now, a new Utopian Tree sapling is planted at the onset of spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases. 
T lines follow; each line contains an integer, N, that denotes the number of cycles for that test case.

Constraints 
1=T=10 
0=N=60


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int h=1;
            for(int j=1;j<n+1;j++)
            {   
                
                if(j%2==1)
                   h=(2*h);
                if(j%2==0 )
                   h=h+1; 
            }
            System.out.println(h);
        }
    }   
}
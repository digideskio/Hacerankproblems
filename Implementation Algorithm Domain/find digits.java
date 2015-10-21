Problem Statement

You are given an integer N. Find the digits in this number that exactly divide N (division that leaves 0 as remainder) and display their count. For N=24, there are 2 digits (2 & 4). Both of these digits exactly divide 24. So our answer is 2.

Note

If the same number is repeated twice at different positions, it should be counted twice, e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. So for this case, our answer is 3.
Division by 0 is undefined.
Input Format

The first line contains T (the number of test cases), followed by T lines (each containing an integer N).


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] num= new int[t+1];
        int i=1;
        //int count=0;
        for( i=1;i<=t;i++)
        {
            num[i]=in.nextInt();
        }    
        for(i=1;i<=t;i++){
           int count=0;
            char[] chars= String.valueOf(num[i]).toCharArray();
            //System.out.println(chars);
            for(char c: chars)
                {
                int rem;
                int n;
                n=Character.getNumericValue(c);
                    //System.out.println(n);
                if(n!=0)
                {
                    rem=num[i]%n;
                    if(rem==0)
                     {
                        count++;
                    }   
                }    
            }
            System.out.println(count);
        }
        
    }
}
Problem Statement

Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. He chooses strings S1 and S2 in such a way that |len(S1)-len(S2)|=1.

Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it an anagram of the second string.

Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

Input Format 
The first line will contain an integer, T, representing the number of test cases. Each test case will contain a string having length len(S1)+len(S2), which will be concatenation of both the strings described above in the problem.The given string will contain only characters from a to z.

Output Format 
An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case. Print -1 if it is not possible.

Constraints

1=T=100 
1=len(S1)+len(S2)=104


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
        int n=sc.nextInt();
        String[] S=new String[n];
        int[] freq1=new int[27];
        int[] freq2=new int[27];
        java.util.Arrays.fill(freq1,new Integer(0));
        java.util.Arrays.fill(freq2,new Integer(0));
        for(int i=0;i<n;i++)
        {
                        
            java.util.Arrays.fill(freq1,new Integer(0));
            java.util.Arrays.fill(freq2,new Integer(0));
            int counte=0;
            S[i]=sc.next();
            int l=S[i].length();
            if(l%2==0)
            {
                counte=0;
                String s1=S[i].substring(0,l/2);
                String s2=S[i].substring(l/2);    
                for(char c: s1.toCharArray())
                {
                          freq1[c-'a']++;
                }
                for(char c: s2.toCharArray())
                {
                          freq2[c-'a']++;
                }
                
                for(int j=0;j<26;j++)
                {
                    if(freq2[j]!=0)
                       if(freq1[j]==0)
                            counte=counte+freq2[j];
                       else
                            counte=Math.max(0,freq2[j]-freq1[j])+counte;                                      
                }   
                System.out.println(counte); 
            }
            else
            {
                System.out.println("-1");
            }
           
        }
    }
}
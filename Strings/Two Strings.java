Problem Statement

You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=105


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
       
        for(int i=0;i<N;i++)
        {
            
           
             String  s1=scan.next();
             String s2=scan.next();
            String result=getCommonElements(s1,s2);
            System.out.println(result);
            
        } 
        
    }
    public static String getCommonElements(String s1, String s2) {
        HashSet<Character> t1 = new HashSet<Character>();
        HashSet<Character> t2 = new HashSet<Character>();
        
        for (char c1 : s1.toCharArray())
            t1.add(c1);
        for (char c2 : s2.toCharArray())
            t2.add(c2);
        t2.retainAll(t1);
       int size=t2.size();
        if(size>=1)
            return "YES";
        else
            return "NO";
    }
}

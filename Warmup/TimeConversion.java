import java.io.*;
Problem Statement

You are given time in AM/PM format. Convert this into a 24 hour format.

Note Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00PM.

Input Format

Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM 
where 
01=hh=12 
00=mm=59 
00=ss=59

Output Format

You need to print the time in 24 hour format i.e. hh:mm:ss 
where 
00=hh=23 
00=mm=59 
00=ss=59

Solution:


import java.util.*;

import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     if(s.contains("PM"))
      {   
        String h=s.substring(0,2);
        String m=s.substring(3,5);
        String se=s.substring(6,8);
        int hh=Integer.parseInt(h);
        if(hh<12) 
        {hh=12+hh;}
        Integer.toString(hh);
        s=hh+":"+m+":"+se; 
        System.out.println(s); 
            
     }
     else
     {   
         s=s.substring(0,8);
         String h=s.substring(0,2);
         String m=s.substring(3,5);
         String se=s.substring(6,8);
         int hh=Integer.parseInt(h);
         if(hh==12)
         {
             h="00";
         }    
         s=h+":"+m+":"+se;
         System.out.println(s);
     }
    }
}
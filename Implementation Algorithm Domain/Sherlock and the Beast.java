Problem Statement

Sherlock Holmes is getting paranoid about Professor Moriarty, his arch-enemy. All his efforts to subdue Moriarty have been in vain. These days Sherlock is working on a problem with Dr. Watson. Watson mentioned that the CIA has been facing weird problems with their supercomputer, 'The Beast', recently.

This afternoon, Sherlock received a note from Moriarty, saying that he has infected 'The Beast' with a virus. Moreover, the note had the number N printed on it. After doing some calculations, Sherlock figured out that the key to remove the virus is the largest Decent Number having N digits.

A Decent Number has the following properties:

3, 5, or both as its digits. No other digit is allowed.
Number of times 3 appears is divisible by 5.
Number of times 5 appears is divisible by 3.
Meanwhile, the counter to the destruction of 'The Beast' is running very fast. Can you save 'The Beast', and find the key before Sherlock?

Input Format
The 1st line will contain an integer T, the number of test cases. This is followed by T lines, each containing an integer N. i.e. the number of digits in the number. 


Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
           
       Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        boolean flag=false;
        for(int i=0;i<T;i++){
            int N = reader.nextInt();
 
            int n5 = N/3;
            int n3 = N-n5*3;
            while(n5>0&&n3>0&&n3%5!=0){
                n5--;
                n3 = N-n5*3;
 
            }
            if(n3%5==0){
                flag = true;
            }
            if(flag==false){
                System.out.println("-1");
            }
            else{
                //int n3 = (int) n3_d;
                while(n5>0){
                    System.out.print("555");
                    n5--;
                }
                while(n3>0){
                    System.out.print("3");
                    n3--;
                }
                System.out.println();
 
            }
        }
    }
}
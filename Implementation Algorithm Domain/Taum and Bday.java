Problem Statement

Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.

The cost of each black gift is X units.
The cost of every white gift is Y units.
The cost of converting each black gift into white gift or vice versa is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

Input Format

The first line will contain an integer T which will be the number of test cases.
There will be T pairs of lines. The first line of each test case will contain the values of integers B and W. Another line of each test case will contain the values of integers X, Y, and Z.

Constraints 
1=T=10 
0=X,Y,Z,B,W=109
Output Format

T lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.


Solution

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
           BigInteger b=sc.nextBigInteger();
           BigInteger w=sc.nextBigInteger();
           BigInteger x=sc.nextBigInteger();
           BigInteger y=sc.nextBigInteger();
           BigInteger z=sc.nextBigInteger();
           BigInteger sum=BigInteger.valueOf(0);
           BigInteger mul1=BigInteger.valueOf(1);
           BigInteger mul2=BigInteger.valueOf(1);
           BigInteger mul3=BigInteger.valueOf(1);
           BigInteger mul4=BigInteger.valueOf(1);
           mul1=b.multiply(x);
           BigInteger sum1=BigInteger.valueOf(0);
           BigInteger sum2=BigInteger.valueOf(0);
           sum1=sum1.add(y);
           sum1=sum1.add(z);
           mul2=b.multiply(sum1);
           sum2=sum2.add(x);
           sum2=sum2.add(z);
           mul3=w.multiply(sum2);
           mul4=w.multiply(y);
           sum =sum.add( mul1.min(mul2));
           sum=sum.add(mul3.min(mul4));
           System.out.println(sum);
           
       }    
    }
}
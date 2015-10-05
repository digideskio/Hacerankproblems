import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       BigInteger[] a=new BigInteger[n+1];
       BigInteger sum=BigInteger.ZERO;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextBigInteger();
           sum=sum.add(a[i]);
       }
       System.out.println(sum);
    }
}
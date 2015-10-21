Problem Statement

You saw a sample challenge in Solve Me First.

Here we give you a full challenge with all of the components that you will typically see on HackerRank. In addition, we have provided a more complex I/O template in your preferred language. The given code includes scanning two space-separated integers from STDIN in a loop over T lines, calling a function, returning a value, and printing that value to STDOUT.

Pseudo code:

read T
loop from 1 to T
    read A and B
    compute the sum
    print value in a newline
end loop
The code has already been provided for most of the popular languages. This is primarily for you to read and inspect how the I/O is handled.

Input Format

The first line contains T (number of test cases) followed by T lines. Each line contains A and B integers, separated by a space.

Output Format

An integer representing the sum for every test case on a new line.

Constraints 
1=T,A,B=1000


Solution:


import java.io.*;
import java.util.*;

class Solution {

    static int solveMeSecond(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a,b;
        t = in.nextInt();
        for (int i=0;i<t;i++) 
        {
            a = in.nextInt();
            b = in.nextInt();
            sum = solveMeSecond(a, b);
            System.out.println(sum);
        }
    }
}
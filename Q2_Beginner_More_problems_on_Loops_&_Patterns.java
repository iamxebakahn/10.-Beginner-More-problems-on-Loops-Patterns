/*Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

****
***
**
*


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Inverted Half Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 **
 *
Output 2:

 ***
 **
 * */
import java.lang.*;
import java.util.*;

public class Q2_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=N;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            
            System.out.println();
                    
        }
    }
}
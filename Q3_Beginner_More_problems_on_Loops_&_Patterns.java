/*Problem Description

Given an integer N, print N stars in a single line.

For example if N = 5 then pattern will be like:

*****

Problem Constraints

2 <= N <= 100



Input Format

Single line input contains a single integer N.



Output Format

Output N stars in a single line.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

**
Output 2:

***
 */
import java.lang.*;
import java.util.*;

public class Q3_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=N;i>=1;i--)
        {
            System.out.print("*");
           
        }
    }
}
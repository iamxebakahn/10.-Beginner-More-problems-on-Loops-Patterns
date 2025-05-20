/*Problem Description

Given two integers N and M as inputs, print a rectangle of N * M stars.










For example if N = 3, M = 4 then pattern will be like:

****
****
****






Problem Constraints

2 <= N, M <= 100



Input Format

First line of input contains an integers N (no of rows).

Second line of input contains an integer M (no of cols).



Output Format

Output N * M rectangle of stars.



Example Input

Input 1:

 2
 3
Input 2:

 3
 1




Example Output

Output 1:










***
***
Output 2:

*
*
*


 */
import java.lang.*;
import java.util.*;

public class Q4_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        for(int i=N;i>=1;i--)
        {
            for(int j=1;j<=M;j++)
                System.out.print("*");
            
            System.out.println();
                    
        }
    }
}
/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces
NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.



Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Full Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

**** // 0 spaces

*__* // 2 spaces
Output 2:

****** // 0 spaces

**__** // 2 spaces

*____* // 4 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

 */
import java.lang.*;
import java.util.*;

public class Q5_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N-i;j++)
                {
                                    
                    System.out.print("*");
                }
                    

            for(int l=0;l<2*i;l++)   
                System.out.print(" ");

               

            for(int k=0;k<N-i;k++)
                {
                                      
                    System.out.print("*");
                }
              

            System.out.println();
                    
        }
    }
}
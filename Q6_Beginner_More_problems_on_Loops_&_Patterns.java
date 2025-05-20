/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

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

*__* // 2 spaces

**** // 0 spaces
Output 2:

*____* // 4 spaces

**__** // 2 spaces

****** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.



 */
import java.lang.*;
import java.util.*;

public class Q6_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
      Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++)
                {
                                    
                    System.out.print("*");
                }
                    

            for(int l=0;l<2*(N-i)-2;l++)   
                System.out.print(" ");

               

            for(int k=0;k<=i;k++)
                {
                                      
                    System.out.print("*");
                }
              

            System.out.println();
                    
        }  
    }
}
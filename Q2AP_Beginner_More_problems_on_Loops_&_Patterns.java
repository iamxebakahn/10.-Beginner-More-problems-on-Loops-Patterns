/*Problem Description

Take T (number of test cases) as input.
For each test case, take integer N as input and Print the last digit of that number.


Problem Constraints

1 <= T <= 100
0 <= N <= 100000000


Input Format

The first line is the number T which denotes the total number of test cases.
Next T lines contain an integer N for which you have to print the last digit.


Output Format

For T different Numbers, Print the last digit in separate lines.


Example Input

Input 1:
2
94
512

Input 2:
2
4987
264


Example Output

Output 1:
4
2


Output 2:
7
4
 */
import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int N=sc.nextInt();
            
            
        /*int first=N;

        
          while(first>=10)
            {
             
             first/=10;
             
            }

        System.out.print(first); */

        
        System.out.print(N%10);
        
        System.out.println();
       
            T--;
        }
        
    }
}
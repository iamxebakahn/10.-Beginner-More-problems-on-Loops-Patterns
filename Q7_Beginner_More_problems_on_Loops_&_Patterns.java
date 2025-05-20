/*Problem Description

Given a number N, print reversed of N.

Note : Create new reverse number, instead of printing number from right to left.


Problem Constraints

-100000 <= N <= 100000


Input Format

N in single line


Output Format

Print Reverse Number in single line


Example Input

Input 1 :
12054

Input 2 :
-12500

Input 3 :
0


Example Output

Output 1 :
45021

Output 2 :
-521

Output 3 :
0
 */
import java.lang.*;
import java.util.*;

public class Q7_Beginner_More_problems_on_Loops_&_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=N;
        if(N<0)
            N=-1*N;
        int d=0, rev=0;

        while(N>0)
        {
            d=N%10;
            N/=10;
            rev=rev*10+d;
        }

        if(temp<0)
            System.out.print(-rev);
        else
            System.out.print(rev);

    }
}
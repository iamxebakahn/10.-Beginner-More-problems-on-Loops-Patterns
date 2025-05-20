/*Problem Description

Take T (number of test cases) as input.
For each test case, take integer N as input and Check whether that number is Palindromic / Not Palindromic.

Note : A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number.


Problem Constraints

1 <= T <= 100
0 <= N <= 100000000


Input Format

The first line is the number T which denotes the total number of test cases.
Next T lines contain an integer N for which you have to print Palindromic / Not Palindromic.


Output Format

For T different Numbers, Print Palindromic / Not Palindromic in separate lines.


Example Input

Input 1:
2
101
51

Input 2:
2
741
2112


Example Output

Output 1:
Palindromic
Not Palindromic

Output 2:
Not Palindromic
Palindromic */
import java.lang.*;
import java.util.*;

public class Q8_Beginner_More_problems_on_Loops_&_Patterns{
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
            
            int temp=N;
        
        int d=0, rev=0;

        while(N>0)
        {
            d=N%10;
            N/=10;
            rev=rev*10+d;
        }

        if(temp==rev)
            System.out.print("Palindromic");
        else
            System.out.print("Not Palindromic");

        System.out.println();
            T--;
        }
        
    }
}
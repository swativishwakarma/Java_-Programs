package ifelse_programs;
import java.util.*;
public class SituationOfNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
	        int a=sc.nextInt();

	    if(a>=0) {
	        if(a%2==0)
	          System.out.println("Number is Positive and Even");
	        else
	          System.out.println("Number is Positive and Odd" );
	    }
	    if(a<0)
	    {
	        if(a%2==0)
	          System.out.println("Number is Negative and Even");
	        else
	          System.out.println("Number is Negative and Odd" );

	    }

	}

}
/*
 * Problem Description
Check whether a given number is positive-odd, positive-even, negative-odd OR negative-even.
Write a code to figure out the Situation.
Take a number N from user and print the Situation Of Number.
if positive-odd : print -> "Number is Positive and Odd"
if positive-even : print -> "Number is Positive and Even"
if negative-odd : print -> "Number is Negative and Odd"
if negative-even : print -> "Number is Negative and Even"


Problem Constraints
-1000000 <= N <= 1000000


Input Format
Take a number N from user.


Output Format
Print the Situation Of Number according to condition.


Example Input
Input 1 :
198

Input 2 :
-167


Example Output
Output 1 :
Number is Positive and Even

Output 2 :
Number is Negative and Odd


Example Explanation
Explanation 1 :
198 is greater than 0 so it is a positive number and 198 % 2 == 0 so it is an even number.

Explanation 2 :
-167 is smaller than 0 so it is a negative number and -167 % 2 != 0 so it is an odd number.


 */

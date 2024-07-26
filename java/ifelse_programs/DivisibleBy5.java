package ifelse_programs;
import java.util.*;
public class DivisibleBy5 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%5==0) 
			System.out.print("Divisible by 5");
		
		else
		
			System.out.print("Not divisible by 5");
		}
}


 /* Problem Description
Given a Number N. If number is divisible by 5,
print "Divisible by 5".
Otherwise print "Not divisible by 5".


Problem Constraints
0 <= N <= 100000


Input Format
In single line, take N in int variable.


Output Format
Print statement in single line accordingly.


Example Input
Input 1 :
135

Input 2 :
149


Example Output
Output 1 :
Divisible by 5

Output 2 :
Not divisible by 5


Example Explanation
Explanation 1 :
Input is 135, which is divisible by 5 that's why output is "Divisible by 5".

Explanation 2 :
Input is 149, which is not divisible by 5 that's why output is "Not divisible by 5". Note : We have to print output without double quotes("").


 */

package loops;
import java.util.*;
public class PrintEvenNumbersFromNTo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        while(0<=n){
            if(n%2==0)
            System.out.print(n+" ");
            n=n-1;
        }
        
	}

}
/*
 * Problem Description
Write a program to print all even numbers from N to 0 where you have to take N as input from the user.


Problem Constraints
1 <= N <= 1000000


Input Format
A single line representing N.


Output Format
All even numbers from N to 0 are separated by spaces.


Example Input
Input 1:
5

Input 2:
10


Example Output
Output 1:
4 2 0

Output 2:
10 8 6 4 2 0


Example Explanation
Explanation 1:
N = 5, all even numbers from 5 to 0 are : 4 2 0

Explanation 2:
N = 10, all even numbers from 10 to 0 are : 10 8 6 4 2 0


 */

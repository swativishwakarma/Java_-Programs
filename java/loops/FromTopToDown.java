package loops;
import java.util.*;
public class FromTopToDown {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        while(i<=n){
	            System.out.print(i+" ");
	            i++;
	        }

	 }
}
/*
 * Problem Description
Write a program that takes a positive integer N as input from the user and prints all natural numbers from 1 to N, with each number followed by a space (including the last number).


Problem Constraints
1 <= N <= 1000000



Input Format
A single line representing N



Output Format
N space separated integers from 1 to N, with each number followed by a space, including the last number.



Example Input
Input 1:

5
Input 2:

10


Example Output
Output 1:

1 2 3 4 5 
Output 2:

1 2 3 4 5 6 7 8 9 10 
 */

package java_prgs_using_sacnner;

import java.util.Scanner;

public class ProblemWithYoungerBrother {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N1= sc.nextInt();
        int N2= sc.nextInt();
        int N3= sc.nextInt();
        System.out.println((N1+N2)%N3);
        

	}

}
/*
Problem Description

Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
You are a programmer and your brother asks you to write a code that helps him to check his approach.


Problem Constraints

0 <= N1, N2 <= 10000000
1 <= N3 <= 10000000


Input Format

First line is number N1.

Second line is number N2.

Third line is number N3.



Output Format

Print the value of remainder.


Example Input

Input 1 :

14

63

12

Input 2 :

53

29

23



Example Output

Output 1 :

5

Output 2 :

13
*/
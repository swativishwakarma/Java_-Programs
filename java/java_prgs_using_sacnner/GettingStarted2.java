package java_prgs_using_sacnner;
import java.util.*;
public class GettingStarted2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        System.out.print(N-M);

	}

}
/*
 * Problem Description

Your friend Rahul plans to visit exotic countries all around the world. Sadly, Rahul's math skills aren't good enough. Take the amount of money Rahul has before the currency exchange and the amount of money that is spent from his savings as input, print the amount of money that remains in his savings.

Input Format

The first line contains an integer N denoting the total savings, the amount of money before exchange.
The second line contains an integer M denoting the exchanging amount, denoting the amount of money that is spent from the savings.
Output Format

Print a single line denoting the amount of money that is left in his savings.
Problem Constraints

1 <= N <= 1000
1 <= M <= N
Example Input

Input:-
116
12
Example Output

Output:-
104
 */

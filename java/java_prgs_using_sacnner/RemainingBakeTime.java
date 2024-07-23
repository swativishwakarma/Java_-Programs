package java_prgs_using_sacnner;
import java.util.*;
public class RemainingBakeTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lasagna =sc.nextInt();
	    System.out.print(40-lasagna);
	        
	}

}

/*
 * Problem Description
You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.


Problem Constraints
0 <= N <= 40


Input Format
The only first line contains the integer N, denoting the actual time (in minutes) the lasagna has been in the oven for.


Output Format
Print in a single line how many minutes the lasagna needs to bake.


Example Input
Input: 
30


Example Output
Output: 
10
 */ 

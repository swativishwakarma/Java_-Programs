package java_prgs_using_sacnner;
import java.util.*;
public class FindNewVolume {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        A++;
        System.out.println(A*A*A);

	}

}
/*
 * Problem Description
Given an integer A, find the volume of a cube with side (A+1).

Note : Try to use shorthand increments for learning purposes.


Problem Constraints
1 <= A <= 100


Input Format
The value of A


Output Format
Print the volume of the new cube.


Example Input
5


Example Output
216


Example Explanation
A = 5
New Cube’s side = 6
New Cube’s volume = 6 * 6 * 6 = 216

 */

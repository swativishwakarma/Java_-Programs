package java_prgs_using_sacnner;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int L= sc.nextInt();
	        int B= sc.nextInt();
	        System.out.print(L*B);
  }

}
/*
 * Problem Description

Given Value of Length (L) and Breadth (B) of a Rectangle. Calculate Area Of Rectangle and Print the Result.

Note :
Formula for Area of rectangle is Area : Length * Breadth



Problem Constraints

1. 0 <= L, B <= 10000
2. L and B are Integer Number.


Input Format

The first line of the input is L denoting the Length
The second line of the input is B denoting the Breadth.


Output Format

Print result in a single line denoting the Area of rectangle.


Example Input

Input 1 :
15
65

Input 2 :
45
26


Example Output

Output 1 :
975

Output 2 :
1170


Example Explanation

Example Exaplanation 1 :
Length of 15 and breadth is 65, Area is 15 * 65 = 975

Example Exaplanation 2 :
Length of 45 and breadth is 26, Area is 45 * 26 = 1170

 */

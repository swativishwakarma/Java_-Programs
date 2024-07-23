package java_prgs_using_sacnner;
import java.util.*;
public class Modify_X {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        X=X*5;
        X=X+10;
        X=X/2;
        System.out.println(X);
  }
}
/*
 * Problem Description
You are given a variable X, modify it using the following steps.
Make X five times greater than the original value.
Increment the value of X by 10.
Divide the value of X by 2.

Note : Do modification in X step by step without using any extra variable. The value of X must be modified at the end of all steps. Do not use any extra variable other than X.


Problem Constraints
1 <= X <= 1000


Input Format
The value of variable X.


Output Format
Print the modified value of variable X.


Example Input
10


Example Output
30


Example Explanation
X = 10
Value of X after making it 5 times greater, X = 50
Value of X after incrementing it by 10, X = 60
Value of X after dividing it by 2, X = 30


 */

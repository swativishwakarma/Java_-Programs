package ifelse_programs;
import java.util.*;
public class CategoriseTheNumber_Nested_if_else {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();

        if(a>0){
              if(a%2==0)
                 System.out.println("Even-Positive");
             else
                 System.out.println("Odd-Positive" );
       }
       if(a<0)
           {
            if(a%2==0)
                 System.out.println("Even-Negative");
           else
                System.out.println("Odd-Negative" );

        }
     }

}
/*
 * Problem Description
Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else


Problem Constraints
-10000 <= N <= 10000 except 0


Input Format
Take Number in single line.


Output Format
Print the statement, according to number N in single line.


Example Input
Input 1 :
15

Input 2 :
-38


Example Output
Output 1 :
Odd-Positive

Output 2 :
Even-Negative


Example Explanation
Example Explanation 1 :
N is 15, which is Odd and Positive.

Example Explanation 2 :
N is -38, which is Even and Negative.


 */

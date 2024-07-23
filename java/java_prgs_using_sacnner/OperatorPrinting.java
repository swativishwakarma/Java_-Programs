package java_prgs_using_sacnner;
import java.util.*;
public class OperatorPrinting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("Number 1 is "+n1);
        System.out.println("Number 2 is "+n2);
        System.out.println("Number 3 is "+n3);

        System.out.println("(n1 > n2) condition is " + (n1 > n2));
        System.out.println("(n2 <= n3) condition is " + (n2 <= n3));
        System.out.println("(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is "+ ((n1 < n2) || ((n2 == n3) && (n1 < n3))) );
        
  }

}
/*
 * Problem Description
Take three numbers from user, i.e. n1, n2 and n3.
Now your target is Print the output in following ways:
In first line : print "Number 1 is " then n1
In second line : print "Number 2 is " then n2
In third line : print "Number 3 is " then n3
In fourth line : print "(n1 > n2) condition is " then print boolean result of (n1 > n2).
In fifth line : print "(n2 <= n3) condition is " then print boolean result of (n2 <= n3).
In sixth line : print "(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " then print boolean result of (n1 < n2) || ((n2 == n3) && (n1 < n3)).


Problem Constraints
-1000000 <= n1, n2, n3 <= 1000000


Input Format
First line is n1
Second line is n2
Third line is n3


Output Format
print the statement with boolean results


Example Input
Input 1 :
47
82
82

Input 2 :
14
78
98


Example Output
Output 1 :
Number 1 is 47
Number 2 is 82
Number 3 is 82
(n1 > n2) condition is false
(n2 <= n3) condition is true
(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is true

Output 2 :
Number 1 is 14
Number 2 is 78
Number 3 is 98
(n1 > n2) condition is false
(n2 <= n3) condition is true
(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is true


Example Explanation
Explanation 1 :
n1(47) is strictly smaller than n2(82) and n2(82) and n3(82) are equal

Explanation 2 :
n1(14) is strictly smaller than n2(78) but n2(78) and n3(98) are not equal


 */

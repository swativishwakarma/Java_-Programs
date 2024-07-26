package ifelse_programs;
import java.util.*;
public class Music_Certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        if(n>10000000)
	        System.out.println("diamond");

	        else if(n>1000000)
	        System.out.println("platinum");

	        else if(n>500000)
	        System.out.println("gold");

	        else
	        System.out.println("None");

	        
	}

}
/*
 * Problem Description
A programmer for a music company is developing a program to determine the highest level of certification for an album.
The program needs to follow this table of thresholds for each certification level:


Minimum albums sold Certification
500000 (5*105) gold
1000000 (106) platinum
10000000 (107) diamond


Given the albums sold(N) as input, print the certification for the album.


Problem Constraints
1 <= N <= 109


Input Format
There is only 1 single line in the input, which is the integer denoting the no. of albums sold.


Output Format
Output the certification either diamond, platinum or gold.
If no certification, print None.


Example Input
Input 1:-
50
Input 2:-
500000


Example Output
Output 1:-
None
Output 2:-
gold


Example Explanation
Explanation 1:
The albums sold (50) is less than all the three condition. So, There is no Certifications, print "None".
Explanation 2:
THe albums sold is greater than equal to (5*105) and less than the remaining thresholds.
So, gold is the highest level of certification. print "gold".


 */

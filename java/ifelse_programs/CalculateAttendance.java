package ifelse_programs;
import java.util.*;
public class CalculateAttendance {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        int N=sc.nextInt();
	        double p=((N * 1.0) / T) * 100;
	          
	        if(p>=75)
	        
	            System.out.println("YES");
	        
	        else
	        
	            System.out.println("NO");
	        
	 }

}
/*
 * Problem Description
Exams are near and Rahul is worried whether he will be allowed to take the exams or not. A student is not allowed to take the exams if his/her attendance is less than 75%. But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not. You are given the total number of classes held (T) and number of classes attended by Rahul (N), print YES or NO.


Problem Constraints
1 <= T <= 1000
1 <= N <= 1000


Input Format
First line is T means total classes.
Second line is N means classes attended by Rahul.


Output Format
Print YES if Rahul’s attendance is >= 75% , otherwise print NO


Example Input
150
100


Example Output
NO


Example Explanation
T = 150
N = 100

Attendance = (100 / 150) * 100 = 66.66%
Attendance is less than 75%, so the output is NO.


 */

package loops;
import java.util.*;
public class MultiplesOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//22
        int i=1;
        int ans=0;

        while((i<=n && ans<=n)){
           
           System.out.print(i*4+" ");
            i++;
            ans=i*4;
            
        }
	}

}
/*
 * Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.

Problem Constraints
1 <= N <= 10000


Input Format
Single line containing an integer N.


Output Format
Space separated integers representing multiples of 4 less than or equal to N.


Example Input
22


Example Output
4 8 12 16 20


Example Explanation
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
4 * 4 = 16
5 * 4 = 20

All are multiples of 4 less than 22
*/

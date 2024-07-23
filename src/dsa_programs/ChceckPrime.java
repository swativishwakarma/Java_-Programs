package dsa_programs;

public class ChceckPrime {
	public static int solve(int A) {
        int count =0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i==A/i)
                count=count+1;
                else
                count=count+2;
            }            
        }
        return count;
    }
    public static int checkprime(int A){
      if(solve(A)==2)
         return 1;
      else
         return 0;
    }
  public static void main(String[] args) {
     int N=1;
     int N1=checkprime(N);
     System.out.print(N1);
  }

}
/*
 * Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer.


Problem Constraints
1 <= A <= 109


Input Format
The first argument is a single integer A.


Output Format
Return 1 if A is prime else return 0.


Example Input
Input 1:
A = 5
Input 2:

A = 10


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
5 is a prime number.
Explanation 2:

10 is not a prime number.
 * */

package dsa_programs;

public class CountPrime {
	
	public static int checkprime(int A) {
		int count = 0;
		for (int i = 1; i * i <= A; i++) {
			if (A % i == 0) {
				if (i == A / i)
					count = count + 1;
				else
					count = count + 2;
			}
		}
		return count;
	}

	public static int solve(int A) {
		int count = 0;
		for (int i = 2; i <= A; i++) {
			if (checkprime(i) == 2) {
				count++;
			}
		}

		return count;

	}
	public static void main(String[] args) {
	     int N=19;
        int N1=solve(N);
	     System.out.print(N1);
  }
	
}

/*
 * You will be given an integer n. You need to return the count of prime numbers
 * less than or equal to n.
 * 
 * 
 * Problem Constraints 0 <= n <= 10^3
 * 
 * 
 * Input Format Single input parameter n in function.
 * 
 * 
 * Output Format Return the count of prime numbers less than or equal to n.
 * 
 * 
 * Example Input Input 1: 19 Input 2: 1
 */

package dsa_programs;

public class RotateArrayKtimes {
	public static int[] revsarr(int A[],int N,int k){
		   
	    int i=0,j=N-1;
	    while(i<j) {
	    	int temp=A[i];
	    	A[i]=A[j];
	    	A[j]=temp;
	    	i++;
	    	j--;
	    }
	    return A;
	  }
	public static int[] ktime(int A[],int N,int k){
		   
	    int i=0,j=k-1;
	    while(i<j) {
	    	int temp=A[i];
	    	A[i]=A[j];
	    	A[j]=temp;
	    	i++;
	    	j--;
	    }
	    return A;
	  }
	public static int[] ntime(int A[],int N,int k){
		   
	    int i=k,j=N-1;
	    while(i<j) {
	    	int temp=A[i];
	    	A[i]=A[j];
	    	A[j]=temp;
	    	i++;
	    	j--;
	    }
	    return A;
	  }
	public static int[] solve(int A[],int N,int k){
	    k=k%N;
	    revsarr( A, N, k);
	    ktime( A, N, k);
	    ntime( A, N, k);
	    
	    return A;
}
	
	
	  public static void main(String[] args) {
	     int a[]={1,2,3,4,5};
	     int N=5,k=3;
	     int ans[]=solve(a,N,k);
	     for(int i=0;i<ans.length;i++){
	         System.out.print(ans[i]+ ",");
	  }

 }
}
/*
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return the array A after rotating it B times to the right


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
Input 2:

A = [2, 5, 6]
B = 1


Example Output
Output 1:

[3, 4, 1, 2]
Output 2:

[6, 2, 5]


Example Explanation
Explanation 1:

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

 * 
 */

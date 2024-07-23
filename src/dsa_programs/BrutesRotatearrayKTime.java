/**
 * 
 */
package dsa_programs;

import java.util.Arrays;

public class BrutesRotatearrayKTime {
	public static int[] rotatearr(int A[],int N,int K){
	  
	   for(int i=0;i<K;i++) {
		   int temp=A[N-1];
		   for(int j=N-1;j>=1;j--) {
			   A[j]=A[j-1];
		   }
		   A[0]=temp;
	   }
	   return A;
	}
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int N=5;
	    int k=2;
	    
	     
	  System.out.print(rotatearr(arr,N, k));
	   
	  }

}

package dsa_programs;

import java.util.Arrays;
import java.util.Iterator;

public class BruterevesArray {
	static int[] revsarr(int arr1[],int N){
	    int i=0,j=N-1;
	    while(i<j){
	      int temp=arr1[i];
	      arr1[i]=arr1[j];
	      arr1[j]=temp;
	      i++;
	      j--;
	    }
	    return arr1;
	  }
	  public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int N=5;
	    int A[]=revsarr( arr, N);
	  	
	  for (int i = 0; i < A.length; i++) {
		System.out.print(A[i]+", ");
	}
	   
	  }
	  
}

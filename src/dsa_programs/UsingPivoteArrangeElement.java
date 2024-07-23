package dsa_programs;

import java.util.Arrays;

public class UsingPivoteArrangeElement {
	public static int[]  partition(int A[],int N,int start,int end) {
		int p=A[start];
		int l=start+1;
		int r=end;
		while(l<=r) {
			if(A[l]<=p){ 
			  	l++;
			}	
			
			else if(A[r]>p){
				r--;
			}	
			
			else {
				swap(A, l, r);
		  }
		}
	 A= swap2(A, start, r);
	 System.out.println(r);
  return A;
}
	
	public static int [] swap(int A[],int l,int r1) {
		 int temp=A[l];
		 A[l]=A[r1];
		 A[r1]=temp;
		 return A;
	}
	
	public static int [] swap2(int A[],int start,int r) {
		int temp=A[start];
		 A[start]=A[r];
		 A[r]=temp;
		
		 return A;
	}
	public static void main(String[] args) {
		int arr[]= {54,26,93,17,77,31,44,55,20};
		int N=arr.length-1;
		int start=0;
		int end=N;
	    int[] r1=partition(arr,N,start,end);
	    System.out.print(Arrays.toString(r1));
	}
		
		
		


}
/*< Question > : Given an integer array, consider first elements as pivot, rearrange the
elements such that for all i :
  If A[i] <= p then it should be present on left side.
  If A[i] > p then it should be present on right side.
  arr - [ 54 , 26 , 93 , 17 , 77 , 31 , 44 , 55 , 20 ]          1 <= N <= 10^5
           0    1    2    3    4    5    6    7    8 
           
           ans = 31 26 20 17 44 54 77 55 93
           index posion of 
*/
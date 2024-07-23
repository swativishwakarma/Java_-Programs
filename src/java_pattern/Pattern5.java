package java_pattern;

public class Pattern5 {
	
	public static void main(String[] args) {
		int n =5;
		for (int i = 1; i <=n; i++) {
			
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 5; i>=1; i--) {
			
			for (int j = n; j>i; j--) {
				System.out.print(" ");
				
			}
			
			for (int k= i; k >=1; k--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	

}

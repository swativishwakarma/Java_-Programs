package java_pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n,k=1;j>=i;j--,k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}

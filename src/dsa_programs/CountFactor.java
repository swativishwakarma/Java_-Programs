package dsa_programs;

public class CountFactor {
	

	/*public static int countfact(int n) {
		//TC: O(N)
		// SC: O(1)
		int count =0;
		for(int i=1;i<=n;i++){
		    if(n%i==0) 
			count++;
			}
		return count;
	}

	public static void main(String[] args) {
		
     int num=6;
     int num1=countfact(num);
     System.out.print(num1);
	}*/
	public static void main(String[] args) {
		System.out.println("===============Static=============");
		CountFactor.m2();
		CountFactor.m4();
		CountFactor.m7();
		CountFactor.ms();
		System.out.println("==============Non Static ============");
		CountFactor a=new CountFactor();
		a.m1();
		a.m3();
		a.m5();
		a.m6();
		System.out.println("==============obj ref Static(should not do) ============");
		a.m2();
		a.m4();
		a.m7();
		a.ms();
	}
	private void m1() {
		System.out.println("private non static m1");
	}
   private static void ms() {
	   System.out.println(" private static ms");
	}
   protected static void m2() {
	   System.out.println(" protected  static  m2");
   }
    protected void m3() {
    	System.out.println("protected non static m3");
   }
    public static void m4() {
    	System.out.println("public  static  m4");
    }
    public  void m5() {
    	System.out.println("public non static m5");
    }
    void m6() {
    	System.out.println("default non static m6");
    }
  static void m7() {
	  System.out.println("default   static m7");
    }
	

}

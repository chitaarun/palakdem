package ratan1;

public class Assignment {
	
	int c=100;
	float d=200;
	static int a=1000;
	static int b=2000;
	
	public void m1() {
		System.out.println(Assignment.a);
		System.out.println(Assignment.b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
	public static void m2() {
		System.out.println(Assignment.a);
		System.out.println(Assignment.b);
		
		
	}
	
	public static void main(String[] args) {
		
       System.out.println( Assignment.a);
       System.out.println(Assignment.b);
       Assignment f = new Assignment();
       f.m1();
       f.m2();
       System.out.println(f.c);
       System.out.println(f.d);
       Assignment.m2();
	}

	
	
}

package ratan1;

public class Staticvari {
	
	
	static int a=1000;
	static int b=2000;
	

	public static void main(String[] args) {
		
        
       System.out.println( Staticvari.a);
       System.out.println(Staticvari.b);
       Staticvari f = new Staticvari();
       f.m1();
	}

	
	public void m1() {
		System.out.println(Staticvari.a);
		System.out.println(Staticvari.b);
	}
}

package ratan;

public class Arrayreturn {

		
		int [] m1(){
		System.out.println("m1 method");
	  int[]a= {10,20,30};
	  return a;
	}

		void m2(double [] d ){
			System.out.println("m2  method");
	for(double dd:d) {
		System.out.println(dd);
	}
	
		}
	public static void main(String[] args) {
		
		Arrayreturn r= new Arrayreturn();
		int[]a= r.m1();
		for(int xx:a) {
			System.out.println(xx);
			
		}
		
double[]d = {10.4,20.5,30.6};
         r.m2(d);
	}

}

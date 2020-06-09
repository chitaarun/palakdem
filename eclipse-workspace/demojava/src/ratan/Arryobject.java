package ratan;

public class Arryobject {

	public static  void main(String[] args) {
		
		Emp e1= new Emp(111, "ratan");
		Emp e2 =  new Emp(222, "anu");
		Emp e3 =  new Emp(333, "durga");
		
		Emp[] e = new Emp[5];
		
		e[0] =e1;
		e[2] =e2;
		e[4] =e3;
	    
	    
	    for(Emp ee:e) {
	    	System.out.println(ee.eid+ "---"+ee.ename);
	    }
	
	}

}

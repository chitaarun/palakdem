package ratan1;

public class Consscope2 {
	
	int eid;
	 String ename;
	 float esal;
	
	Consscope2(){
		int id=111;
		String ename="ratan";
		float esal = 1000;
	
			
	}
	
    void display() {
    	System.out.println("employee id is "+ eid);
    	System.out.println("employee ename is "+ ename);
    	System.out.println("employee esal is "+ esal);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consscope2 cs = new Consscope2();
		cs.display();
		Consscope2 cs2 = new Consscope2();
		cs2.display();
		
		
	}

}

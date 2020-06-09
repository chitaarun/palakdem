package ratan1;

public class Consscope {
	
	int eid;
	 String ename;
	 float esal;
	
	Consscope(int eid,String ename,float esal){
	//conversion of local variable to instance variable	
		this.eid=eid;
		this.ename=ename;
		this.esal= esal;
			
	}
	
    void display() {
    	System.out.println("employee id is "+ eid);
    	System.out.println("employee ename is "+ ename);
    	System.out.println("employee esal is "+ esal);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consscope cs1 = new Consscope(111,"ratan", 1000);
		cs1.display();
		Consscope cs = new Consscope(222, "arun", 2000);
		cs.display();
		
		
	}

}

package ratan1;

public class Instancevari {
	
	
	int a=10;
	int b=20;
	

	public static void main(String[] args) {
		
        Instancevari b = new Instancevari();
       System.out.println( b.a);
        b.add();
	}

	
	public void add() {
		System.out.println(a);
		System.out.println(a+b);
	}
}

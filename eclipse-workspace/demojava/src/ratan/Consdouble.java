package ratan;

import java.nio.ShortBuffer;

public class Consdouble {

//Method manipulation
	public Consdouble(String str){}
	
	public static void main(String[] args) {
		
		Consdouble t1 = new Consdouble("arun");
		Consdouble t2 = new Consdouble("arun");
		System.out.println(t1.equals(t2));//false
	
	
	String s1="ratan";//string over writing object class content
	String s2="ratan";
	
	System.out.println(s1.equals(s2));//true
	
	
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();
	
	System.out.println(sb1.equals(sb2));//object class reference variable
	
	
	}
	

}




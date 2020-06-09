package home;

import java.util.ArrayList;
import java.util.HashMap;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a []= new int[5];
		
		a[0]= 4;
		a[1]= 7;
		a[2]= 9;
		a[3]= 3;
		a[4]= 2;
		 
	
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) {
				System.out.println("index number is ------"+ i);
			}
			System.out.println(i);
			
		}
		
		System.out.println(a[4]);
		
		
		Integer n[]= {1,2,3,4,5,5};
		System.out.println(n);
		
		ArrayList ls = new ArrayList();
		
		ls.add(0, "one");
		ls.add(1, "two");
		ls.add(2, "three");
		System.out.println(ls);
		ls.remove("two");
		System.out.println(ls);
		
		try {a[5]=8;
		System.out.println(a);
		}
		
		catch(ArrayIndexOutOfBoundsException moga) {
			System.out.println(moga);
		}
catch(Exception e) {
	System.out.println(e.getMessage());
}
	
	HashMap DesiredCapavilities = new HashMap();
	
	DesiredCapavilities.put("osName", "windows 10");
	DesiredCapavilities.put("browser", "chrome");
	DesiredCapavilities.put("browser1", "chrome");
	DesiredCapavilities.put("version", "81");
	System.out.println(DesiredCapavilities);
	
	
	
	
	
	
	
}
}
	



package ratan1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;


public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\demojava\\abc");

		FileInputStream fis = new FileInputStream("abc.txt");//read
		FileOutputStream fos =new FileOutputStream("xyz.txt");//write
		
		int c;
		
		while((c=fis.read())!=-1) {
			
			System.out.println(c);
			fos.write(c);
			
		}
		 
		fis.close();
		fos.close();
		
		
	}

}

  package File_Handling_IO;


import java.io.*;

public class CountFileAndDirectories {

	public static void main(String[] args) {

		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming");
		
		int count=0;
		
		String fname[] =file.list();
		
		for(String str :fname)
		{
			count++;
			
			System.out.println(str);
		}
		
		System.out.println("The total number of files are :"+count);
		
	}

}

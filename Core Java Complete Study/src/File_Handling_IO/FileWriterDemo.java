 package File_Handling_IO;

import java.io.*;
import java.util.*;

public class FileWriterDemo {

	public static void main(String x[]) throws InterruptedException, IOException
	{
		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming\\FileHandlingPractice\\demo3.txt");
		
		FileWriter fw =null;
		
		fw = new FileWriter(file,true);
			
		 System.out.println("Enter the data in file :");
			 
			 Scanner sc = new Scanner(System.in);
			 
			 String data = sc.nextLine();
			 
			 fw.write(data);
			 
			System.out.println("Data Inserted successfully :");
			
			fw.close();
					
		
	}
}

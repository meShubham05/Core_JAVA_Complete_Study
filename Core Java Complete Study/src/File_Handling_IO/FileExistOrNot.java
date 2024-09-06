package File_Handling_IO;

import java.io.*;

public class FileExistOrNot {

	public static void main(String x[]) throws Exception
	{
		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming\\FileHandlingPractice\\demo3.txt");
		
		System.out.println("file is exist :"+file.exists());
			
		if(!file.exists())
		{
			file.createNewFile();
		
			System.out.println("File Created Successfully :");
		}
	}
}

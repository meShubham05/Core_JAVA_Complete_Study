package File_Handling_IO;

import java.io.*;

public class FileDemo {

	public static void main(String x[]) throws IOException
	{
	File file = new File("D:\\GIRI TECH HUB\\JAVA Programming\\FileHandlingPractice\\demo2.txt");
	
	boolean b =file.exists();
	
	if(!b)
	{
		boolean b1 = file.createNewFile();
		System.out.println("file created succcessfully ....");
	}
	else
	{
		System.out.println("File Aready present :");
	}
	}
}

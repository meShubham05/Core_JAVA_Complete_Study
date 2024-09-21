 package File_Handling_IO;


import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args)  throws IOException,Exception{

		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming\\FileHandlingPractice\\demo3.txt");
		
		
		FileReader fr = new FileReader(file);
		
		int read = fr.read();
		
		while(read!=-1)
		{
			System.out.print ((char)read);
			read=fr.read();
		}
		
		
		
		
		
		
		
		
	}

}

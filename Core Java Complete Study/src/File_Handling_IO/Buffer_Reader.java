package File_Handling_IO;

import java.util.*;
import java.io.*;


public class Buffer_Reader {

	public static void main(String x[]) throws IOException, InterruptedException

	{

		FileReader fr = new FileReader("D:\\GIRI TECH HUB\\shubham.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String data;
		
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
			Thread.sleep(1000);
		}
	}
}

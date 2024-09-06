package File_Handling_IO;


import java.io.*;

public class DisplayFileName {

	
	public static void main(String x[])
	{
		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming");
		
		String [] fname =file.list();
		
		for(String str:fname)
		{
			System.out.println(str);
		}
	}
}

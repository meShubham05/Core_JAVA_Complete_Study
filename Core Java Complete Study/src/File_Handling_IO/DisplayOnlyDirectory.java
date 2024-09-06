package File_Handling_IO;


import java.io.*;

public class DisplayOnlyDirectory {

	public static void main(String x[])
	{
		File file = new File ("D:\\GIRI TECH HUB\\JAVA Programming");
		
		String fname [] = file.list();
		
		for(String str :fname)
		{
			File f = new File(file,str);
			
			if(f.isDirectory())
			{
				System.out.println(str);
			}
			
			
		}

	}
}
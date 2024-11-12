package File_Handling_IO;


import java.io.*;

import java.util.*;

public class FindConsonentVowel {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		

		File file = new File("D:\\GIRI TECH HUB\\JAVA Programming\\FileHandlingPractice\\file.txt");

		boolean fileExist = file.exists();
		
		if(fileExist)
		{
			System.out.println("File already exist :");
		}
		else
		{
			System.out.println("File not found");
		}
			
		
		FileReader fr = new FileReader(file);
		
		int read = fr.read(),count=0,countofConsonent=0;
	
		while(read!=-1)
		{
			if(((char)read>='a' && (char)read<='z' )||((char)read>='A' && (char)read<='Z'))
			{
			if(read=='a'||read=='e'||read=='i'||read=='o'||read=='u' ||read =='A'||read =='E'||read =='I'||read =='O'||read =='U')
			{
				System.out.print(" "+(char)read);
				count++;
			}
			else
			{
				countofConsonent++;
				
			}				
			}
			read = fr.read();
		}
		System.out.println("\n\nThe total no of vowels in the file is :"+count);
		System.out.println("the connsonent is :"+countofConsonent);
		
		fr.close();
		sc.close();
	
	}
}

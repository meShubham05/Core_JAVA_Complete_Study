package File_Handling_IO;

import java.io.*;

public class ExamQuestionGTH {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	FileReader fr = new FileReader("D:\\GIRI TECH HUB\\student.txt");
	
	BufferedReader br = new BufferedReader(fr);
	
	char data;
	
	
	
	while((data=br.read())!=null)
	{
		System.out.println(data);
		
		
		Thread.sleep(1000);
	}
	
	}
}

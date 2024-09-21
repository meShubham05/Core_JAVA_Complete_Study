package File_Handling_IO;


import java.io.*;
import java.util.*;

public class BufferWriterDemo {

	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\GIRI TECH HUB\\shubham.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter data in file");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		
		System.out.println("Data Added Successfully :");	
	}
}

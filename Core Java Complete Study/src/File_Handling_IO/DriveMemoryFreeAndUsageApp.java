package File_Handling_IO;

import java.io.*;

public class DriveMemoryFreeAndUsageApp {

public static void main(String[] args) {
	
	File file = new File("");
	
	long space = file.getTotalSpace();
	
	System.out.println("The total space in your pc is :"+space);
}
}

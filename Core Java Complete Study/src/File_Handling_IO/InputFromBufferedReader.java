package File_Handling_IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


public class InputFromBufferedReader {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first string :");
		String str = sc.next();
		
		
		System.out.println("enter second string :");
		int num =sc.nextInt();
		
		
		System.out.println(str);
		System.out.println(num);
	}

}

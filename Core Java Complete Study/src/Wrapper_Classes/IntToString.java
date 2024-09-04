package Wrapper_Classes;

import java.util.*;

public class IntToString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to conver integer into string :");
	
			int num =sc.nextInt();
		
			String str = Integer.toString(num);
			
			System.out.println("The String is :"+str);
			
			
			String str2 = String.valueOf(num);
			
			System.out.println("The Second String is :"+str2);
			
	}

}

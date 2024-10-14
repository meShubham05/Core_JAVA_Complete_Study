package Wrapper_Classes;

import java.util.*;

public class StringToInt {
	
	public static void main(String x[])
	{		
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the String :");
	
	String str = sc.nextLine();
	
	int num = Integer.parseInt(str);
	System.out.println("The Number is : "+num);
	
	
	int num2 = Integer.valueOf(str);
	 
	System.out.println("The second number is :"+num2);
	
	int num3=num+num2;
	
	System.out.println("The Addition is "+num3);
	
	}
}

package Looping_Programs;

import java.util.*;

public class Count_The_Digits_In_Number {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		System.out.println("Enter any number to count the total digits :");
		num=sc.nextInt();
		
		while(num>0)
		{
			
			num =num/10;
			
			count++;
		}
		System.out.println("Total digits are : "+count);
		
		
	}
}

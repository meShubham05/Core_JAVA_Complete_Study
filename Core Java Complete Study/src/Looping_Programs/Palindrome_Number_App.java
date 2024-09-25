package Looping_Programs;

import java.util.*;

public class Palindrome_Number_App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is Palindrome or not :");
		int num =sc.nextInt();
		
		int temp=num,rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		System.out.println("After reverse : "+rev);
		
		temp=rev;
		if(temp==num)
		{
			System.out.println("Number is Palindrome :");
		}
		else
		{
			System.out.println("Number is Not Palindrome :");
		}
	}
}

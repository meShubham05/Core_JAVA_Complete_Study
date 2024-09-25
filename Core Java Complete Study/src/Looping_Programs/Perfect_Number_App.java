package Looping_Programs;

import java.util.Scanner;

public class Perfect_Number_App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int num = sc.nextInt() ,rem=0,sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum :"+sum);
		
			if(sum==num)
			{
				System.out.println("Number is Perfect Number :");
			}
			else
			{
				System.out.println("Number is Not Perfect :");
			}
		
		
			
		
	}
}

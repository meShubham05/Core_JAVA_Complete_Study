package Looping_Programs;

import java.util.*;

public class Check_Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number :");
		int num =sc.nextInt(),count=0;
		
	
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("Number is Not Prime ");
		}
		else
		{
			System.out.println("Number is Prime :");
		}
	}
}

package Looping_Programs;

import java.util.*;

public class ArmsStrong_App {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check the number is armstrong or not :");
		num=sc.nextInt();
		
		int temp=num,count =0,rem=0,sum=0;
		
		
		while(temp!=0)
		{
			temp=temp/10;
			
			count++;
		}
		
		temp=num;
		
		while(temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			sum =sum + (int)Math.pow(rem,count);
			System.out.println("sum :"+sum);
		}
			
		
		if(sum==num)
		{
			System.out.println("The number is ArmStrong :");
		}
		else
		{
			System.out.println("The  Number is not Armstrong :");
		}
	}
}

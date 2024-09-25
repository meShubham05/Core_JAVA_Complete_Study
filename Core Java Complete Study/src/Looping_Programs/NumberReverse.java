package Looping_Programs;

import java.util.*;

public class NumberReverse {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
		int temp=num,count=0,rev=0,rem=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("No of digits in the number is : "+count);
		
	
		int reverse[]=new int[count];
		int i=0;
		while(num!=0)
		{
			rem = num%10;
		
			// rev = rev*10+rem;
			
			reverse[i]=rem;
			i++;
			num = num/10;
			
		}
		
		System.out.println("After reverse");
		for(i =0;i<count;i++)
		{
		System.out.print(reverse[i]);
		}
		
	}
}

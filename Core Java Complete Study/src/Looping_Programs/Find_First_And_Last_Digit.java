package Looping_Programs;

import java.util.Scanner;

public class Find_First_And_Last_Digit {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		int temp =num,fdigit=0,ldigit=0,rem=0;
		
		
			rem=temp%10;
			
			ldigit=rem;
		
		
		
		while(num!=0)
		{
			num=num/10;
			if(num<=9)
			{
			rem=num%10;
			fdigit=rem;
				break;
			}
		
		}
		System.out.println("last Digit :"+ldigit);
		System.out.println("first digit :"+fdigit);
		
		
	}
}

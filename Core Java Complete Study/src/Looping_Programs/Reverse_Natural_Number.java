package Looping_Programs;

import java.util.Scanner;

public class Reverse_Natural_Number {

	public static void main(String[] args) {
		
		int i=1,num;
		System.out.println("Enter the limit to print the reverse order :");
		Scanner sc =new Scanner(System.in);
		num =sc.nextInt();
		
		while(num>=i)
		{
			System.out.println(num);
			num--;
		}
		
	}
}

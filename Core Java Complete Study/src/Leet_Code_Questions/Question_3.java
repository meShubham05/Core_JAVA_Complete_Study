package Leet_Code_Questions;
 

/* 
 	
 		Problem Statement 3
	Problem
	Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
	Calculate Pooja's account balance after an attempted transaction.
	Input
	Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
	Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
	Output
	Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
	Example - Successful Transaction
	Input:
	30 120.00
	Output:
	89.50
	Example - Incorrect Withdrawal Amount (not multiple of 5)
	Input:
	42 120.00
	Output:
	120.00
	Example - Insufficient Funds
	Input:
	300 120.00
	Output:
	120.00

 	
 	
 */

import java.util.*;

public class Question_3 {

	public static void main(String x[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the current balance in your account :");
		
		int balance = sc.nextInt();
		
		
			System.out.println("Enter the amount you want to withdrawl :");
			
			int withdrawl =sc.nextInt();
			
			if(withdrawl%5==0)
			{
				if(withdrawl>balance)
				{
					System.out.println("Insufficient Funds"+"\n Your balance is :"+balance);
				}
				
				else
				{
					float interest =0.5f;
					
					float balance2 =balance-withdrawl - interest;
					System.out.println(balance2);
					System.out.println("your transaction is successful :");
				
					
				}
			}
			else
			{
				System.out.println("Enter the proper withdrawl amount with the multiple of 5 :");
				System.out.println("Your Balance :"+balance);
			}
			
	}
	
}

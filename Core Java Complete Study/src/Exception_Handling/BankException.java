package Exception_Handling;

import java.util.*;


class InsufficientBalance extends Exception
{
	 InsufficientBalance(String msg)
	 {
		super(msg);
	 }
}
 
class AmountWithDrawl  
{
	int balance =5000;
	
	public void amountWithDrawl( int amount) throws InsufficientBalance
	{
		if(amount<balance)
		{
			int currentBalance =balance-amount;
			
			System.out.println("Amount withdrawled successfully :");
			System.out.println("Current Balance is :"+currentBalance);
		}
		else
		{
			throw new InsufficientBalance("Insuffient balance !!! Enter proper amount... ");
			
		}
	}
}


public class BankException  {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the amount you want to add :");
	
	int amount= sc.nextInt();
	
	AmountWithDrawl a = new AmountWithDrawl();
	
	try
	{
		a.amountWithDrawl(amount);
	}
	catch(InsufficientBalance e)
	{
		System.out.println(e);
	}

	}
}

package Exception_Handling;

import java.util.*;
import java.lang.*;
import java.lang.reflect.InaccessibleObjectException;


class AgeRestriction extends Exception
{
	AgeRestriction(String msg)
	{
		super(msg);
	}
	 
}

public class ThrowDemo  {

	public void setAge(int age) throws AgeRestriction 
	{
		if(age<18)
		{
			throw new AgeRestriction("you are not allow to do vote :");
		}
		else
		{
			System.out.println("You are allowed to do vote :");
		}
	}
	
	
	public static void main(String x[])
	{
		
		ThrowDemo t = new ThrowDemo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of voter :");
		
		int age = sc.nextInt();
		
		try
		{
			t.setAge(age);
		}
		catch(AgeRestriction d)
		{
			System.out.println(d);
		}
		
		
	}
}

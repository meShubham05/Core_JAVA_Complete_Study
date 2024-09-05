package Exception_Handling;


import java.util.*;

public class UserDefinedExceptionDemo {

	static class UserDefined extends RuntimeException
	{
		UserDefined(String msg)
		{
			super(msg);
		}
	}
	
	static class CheckVoter
	{
		public void checkVoter(int age)
		{
			if(age<18)
			{
				throw new UserDefined("You are not allowed to Vote :");
			}
			else
			{
				System.out.println("You are allowed to do Vote :");
			}
		}
	}
	
	
	public static void main(String x[])
	{
		CheckVoter c = new CheckVoter();
		try
		{
		
			c.checkVoter(15);
		}
		catch(UserDefined e)
		{
			System.out.println(e);
		}
	}
} 

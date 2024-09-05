package Exception_Handling;

import java.util.Scanner;

public class ExceptionDemo {

	static class UserDefinedException extends RuntimeException
	{
		UserDefinedException(String msg)
		{
			super(msg);
		}
	}
	
	static class CheckNumberValid
	{
		public void checkValidNumber(int x,int y)
		{
			String s = Integer.toString(x);
			
			String s2 = Integer.toString(y);
			
			char ch [] = s.toCharArray();
			char ch2[] = s2.toCharArray();
			
			for(int i=0;i<s.length();i++)
			{
				
			
			if((ch[i]>='a' || ch[i]<='z' ) || (ch2[i]>='a' || ch2[i]<='z'))
			{
				throw new UserDefinedException("You entered the Wrong Number here :");
				
			}
			else
			{
				System.out.println("No issue to add :");
			}
		  }
		}
		
		
	}
	
	
	public static void main(String x[])
	{
		int a ,b ,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number to add");
		
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a+b;
			
			System.out.println("The Additon is :"+c);
			
			
			
			CheckNumberValid ch = new CheckNumberValid();
			ch.checkValidNumber(a,b);
			
			
		}
		catch(UserDefinedException u)
		{
			System.out.println(u);
		}
		
	}

}

package Exception_Handling;

import java.util.Scanner;

public class CharValidOrNot {

	static class UserDefinedException extends RuntimeException
	{
		UserDefinedException(String msg)
		{
			super(msg);
			
		}
		
	}
	
	static class ValidCharacterOrNot
	{
		public void checkCharacter(char ch[])
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>=0 || ch[i]<=9)
				{
					throw new UserDefinedException("Invalid Character :");
				}
				else
				{
					System.out.println("Correctly Entered Data :");
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String data;
		
	do
	{
			
		
		System.out.println("Enter the String in Character Only :");
		
		 data = sc.nextLine();
		
		char[] ch = new char[data.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]= data.charAt(i);
		}
		
		try
		{
		ValidCharacterOrNot v = new ValidCharacterOrNot();
		
		v.checkCharacter(ch);
		
		}
		catch(UserDefinedException u)
		{
			System.out.println(u);
		}

	}while(data!=null);
		
		
		
	

}
}
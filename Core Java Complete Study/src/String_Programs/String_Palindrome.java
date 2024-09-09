package String_Programs;

import java.util.*;

public class String_Palindrome {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = sc.nextLine();
		
		char ch [] = new char[str.length()];
	
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		int end = ch.length-1;
		boolean isPalindrome=true;
		
		for (int i=0;i<(end)/2;i++)
		{
			if(ch[i]!=ch[end])
			{
				isPalindrome=false;
				break;
			}
			
			
			end--;
			
		}
		if(isPalindrome)
		{
			System.out.println("String is palindrome :");
		}
		else
		{
			System.out.println("String is not Palindome :");
		}
	}
}

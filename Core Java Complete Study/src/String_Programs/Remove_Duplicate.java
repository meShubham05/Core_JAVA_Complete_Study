package String_Programs;

import java.util.*;



/*
 
  5. Remove Duplicates from a String

Problem: Given a string, remove all duplicate characters without using any additional data structures.
Example:
Input: "programming"
Output: "progamin"

 */

public class Remove_Duplicate {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to remove the duplicate character form string :");
		
		String str = sc.nextLine();

		char ch [] = new char[str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		int duplicate=0;
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch[i+1])
			{
				
			}
		}
		
		
		
		
	}
}

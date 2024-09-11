package String_Programs;

/*
3. Find the First Non-Repeating Character

Problem: Given a string, find the first character that does not repeat.
Example:
Input: "swiss"
Output: 'w'

	*/

import java.util.*;

public class First_Non_Repeating_Character {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		
		String str = sc.nextLine();
	
		
		char ch[] = new char [str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		
		int count =0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}

				
			}
			System.out.print(""+ch[i]);
		}
		

		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]!=ch[j])
				{
					System.out.println(" "+ch[i]);
					break;
				}
			}
			break;
			
		}
		
		
	}
	
	
	
}

package String_Programs;

import java.util.*;

/*
 
4. Count the Number of Vowels and Consonants

Problem: Write a function to count the number of vowels and consonants in a given string.
Example:
Input: "hello"
Output: Vowels: 2, Consonants: 3

*/


public class Count_Vowel_Consonent {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to count the vowel and consonent :");
		
		String str =sc.nextLine();
		
		char ch[]= new char [str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		
		int vowel =0,consonent =0;
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='a' && ch[i]<='z')
			{	
				
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					vowel++;
				}
				else
				{
					consonent++;
				}
			}
		}
		
		System.out.println("The Total vowel are :"+vowel);
		
		System.out.println("The Toatal Consonent are :"+consonent);
		
	}
}

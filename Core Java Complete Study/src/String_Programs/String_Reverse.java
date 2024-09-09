package String_Programs;

import java.util.*;

public class String_Reverse {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		
		String str = sc.nextLine();
		
		char ch[] = new char[str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		
		System.out.println("After string reverse :");
		
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(" "+ch[i]);
		}

	}
}

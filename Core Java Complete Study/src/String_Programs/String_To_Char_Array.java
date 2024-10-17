package String_Programs;

import java.util.*;

public class String_To_Char_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String :");
		
		String str = sc.nextLine();
		System.out.println("Enter second String :");
		
		String str2= sc.nextLine();		
		char ch[] = new char[str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);			
			System.out.print(" "+ch[i]);
		}		
		char ch2[] = new char[str2.length()];		
		
		System.out.println("\n After converting the second string :");
		for(int i=0;i<ch.length;i++)
		{
			ch2[i]=str2.charAt(i);			
			System.out.print(" "+ch2[i]);
		}		
		char ch3[]= new char [str.length()+str2.length()];		
		System.out.println("\n The size of final array is :"+ch3.length);
		
		int i=0,j=0,k=0;
		for( k=0;k<ch3.length;k++)
		{
			ch3[k]=ch[i];
			i++;
			k++;
			ch3[k]=ch2[j];
			j++;
		}
		
		for( k=0;k<ch3.length;k++)
		{ 
			System.out.print(ch3[k]);
		}
		
		
		
		
		
	}

}

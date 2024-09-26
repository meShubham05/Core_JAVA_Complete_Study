package String_Programs;

import java.util.*;

public class String_Reverese_Order_Word_Another {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str =sc.nextLine();

		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			int index=i;
			
			for( ;i<ch.length && ch[i]!= ' ';i++)
			{
				
				
			}
			int end=i-1;
			
			for(int j=index;j<end;j++,end--)
			{
				char temp =ch[j];
				ch[j]=ch[end];
				ch[end]=temp;
				
			}
			
			
		}
		
		System.out.println("After revversing the string :" +new String(ch));
		
		}
}

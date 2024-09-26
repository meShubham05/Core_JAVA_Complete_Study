package String_Programs;

import java.util.Scanner;

public class First_Character_Occurence {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String :");
	
	String str =sc.nextLine();

	char ch[]=str.toCharArray();
	char firstchar =' ';
	int count=0,i=0;
	
	while(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' )
		{
			 firstchar =ch[i];
			 i++;
			 break;			
		}
	
	for(i=0;i<ch.length;i++)
	{
		if(firstchar == ch[i])
		{
			count++;
		}
	}
	
	System.out.println("The Occurecy of :"+firstchar+" ===> "+count);
	
		sc.close();
	}
}

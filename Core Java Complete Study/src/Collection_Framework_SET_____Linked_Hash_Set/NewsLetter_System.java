package Collection_Framework_SET_____Linked_Hash_Set;

import java.util.*;


class Email
{
	HashSet set = new HashSet();
	
	
	void addEmail(String email)
	{
		set.add(email);
	}
	
	
	
}
public class NewsLetter_System {

	public static void main(String[] args) 
	{
		Email email = new Email();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String data = sc.nextLine();
		
		email.addEmail(data);
			
		
	}
}

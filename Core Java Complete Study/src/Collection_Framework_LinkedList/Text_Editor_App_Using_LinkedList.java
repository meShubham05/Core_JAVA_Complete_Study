package Collection_Framework_LinkedList;

import java.util.*;



class Text_Editor
{
	LinkedList <String> list = new LinkedList<String>();
	
	
	public void addAction(String action)
	{
		list.add(action);
	}
	
	public void undo()
	{
		list.remove();
	}
	
	
	public void listActions()
	{
		for(Object obj :list)
		{
			System.out.println(obj);
		}
	}
	
}
public class Text_Editor_App_Using_LinkedList {

	public static void main(String[] args) 
	{
		
		Text_Editor text = new Text_Editor();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Welcome to the Text Editor App :");
			System.out.println(" 1 : Add Text \n 2: Remove Text \n 3 : Show All Text :");
			System.out.println("\n Enter Your Choice ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					System.out.println("Add Your text :");
					
					String data =sc.nextLine();
					
					text.addAction(data);
					
					break;
					
				case 2:
					
					text.undo();
					
					break;
					
					
				case 3 :
					
					System.out.println(" All Data : \n ");
					
					 text.listActions();
					
					 break;
					 
					
			}
			
			
		}
		while(true);
				
		
	}
}

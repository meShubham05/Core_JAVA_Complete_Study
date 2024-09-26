package Collection_Framework___Stack_Collection;

import java.util.*;

public class Stack_Opeartion {

	public static void main(String[] args) {
			Stack s = new Stack();
			do {
				Scanner xyz = new Scanner(System.in);
				System.out.println("1:PUSH");
				System.out.println("2:POP");
				System.out.println("3:View All");
				System.out.println("4:Stack is Empty");
				System.out.println("Enter your choice");
				int choice = xyz.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter value in stack");
					int value=xyz.nextInt();
					s.push(value);
					break;
				case 2:
					boolean b=s.empty();
					if(b) {
						System.out.println("Stack is underflow");
					}
					else {
						Object obj=s.pop();
						System.out.println(obj);
					}
					break;
				case 3:
					ListIterator li=s.listIterator(s.size());
					while(li.hasPrevious()) {
						Object obj = li.previous();
						System.out.println(obj);
					}
					break;
				case 4:
					 b=s.empty();
					if(b) {
						System.out.println("Stack is underflow");
					}
					else {
						Object obj=s.peek();
						System.out.println(obj);
					}
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice");
				}
			} while (true);
		}
	}
	

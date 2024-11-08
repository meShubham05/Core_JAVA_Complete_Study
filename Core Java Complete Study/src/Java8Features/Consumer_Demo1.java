package Java8Features;


import java.util.*;
import java.util.function.Consumer;


public class Consumer_Demo1 
{
public static void main(String[] args) 
{
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	Consumer c = new Consumer()
			{
				public void accept(Object t) 
				{
					System.out.println(t);
				}
			};
	
			list.forEach(c);
	
	
}
}

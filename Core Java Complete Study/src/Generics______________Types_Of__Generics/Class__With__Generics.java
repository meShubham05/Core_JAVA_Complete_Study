package Generics______________Types_Of__Generics;

class Test<E>
{
	void show(E e)
	{
		System.out.println(" "+e);
	}
}

public class  Class__With__Generics
{
	public static void main(String[] args)
	{
		
	Test<Integer> t = new Test<Integer>();
	
	t.show(10);
	t.show(20);
	
	}
}



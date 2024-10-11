package Interfaces;



/*
 
	Java 7 Interface Rules:
	
	All methods are abstract:
	
	Methods in interfaces do not have implementations, and the keyword abstract is optional because it's implied.

No concrete methods (non-abstract methods):
Interfaces cannot have method implementations in Java 7.

All methods are public:
Methods in interfaces are implicitly public, even if you do not specify it.

No constructors:
Interfaces cannot have constructors because they are not meant to create objects directly.

*/

public interface InterfaceDemo {

	public void show();
	
}

class A implements InterfaceDemo
{
	public void show()
	{
		System.out.println("This is demo Method :");
	}
}



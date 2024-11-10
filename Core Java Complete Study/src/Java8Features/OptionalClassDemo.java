package Java8Features;

import java.util.Optional;

public class OptionalClassDemo {
	
	public static void main(String[] args) {
		
	String name = "Java Programing ";
	
	Optional<String> opt =Optional.ofNullable(name);
	
	if(opt.isEmpty())
	{
		System.out.println("The Data is Null :");
	}
	else
	{
		String data = opt.get();
		
		System.out.println("The length of the string  is : "+data.length());
	}
	
	}

}

package Abstract_Classes;

abstract class Engine
{
	public abstract void showVehicle();
	
	public void startEngine()
	{
		System.out.println("Engine Started :");
	}
}

class Car extends Engine
{
	public void showVehicle()
	{
		System.out.println("I am Car Vehicle :");
	}
}

class Bike extends Engine
{
	public void showVehicle()
	{
		System.out.println("I am Bike Vehicle :");
	}

}


public class Abstract_Class_Shared_BehaviourDemo 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.startEngine(); // concrete methods are used here to share the common behavior
		c.showVehicle(); 
		
		Bike b = new Bike();
		b.startEngine(); // concrete methods are used here to share the common behavior
		b.showVehicle();				
		
	}

}

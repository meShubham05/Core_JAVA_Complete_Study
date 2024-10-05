package Generics______________Types_Of__Generics;

interface Item<E>
{
	void showDetails(E details);
}

class Electronics implements Item<Integer>
{
	public void showDetails(Integer e)
	{
		System.out.println("Electronics price is : "+e +" ₹");
	}

}
class Clothing implements Item<String>
{
	public void showDetails(String d)
	{
		System.out.println("Size of Clothing : "+d);
	}
}

class Groceries implements Item<Float>
{
	public void showDetails(Float weight)
	{
		System.out.println("The Weight of Groceries : "+weight+" Kg");
	}
}
public class Shopping_Cart_Real_Life_with_Generic_Interface 
{
	public static void main(String[] args) {
	
		Electronics e =new Electronics ();
		e.showDetails(10);

		Clothing c = new Clothing();
		c.showDetails("XL");
		
		Groceries  g = new Groceries();
		g.showDetails(120.f);
		
}
}

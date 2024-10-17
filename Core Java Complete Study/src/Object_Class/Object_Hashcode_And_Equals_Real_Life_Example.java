package Object_Class;


class Book
{
	private int isbn;
	private String bName;
	private String authorName;

	public Book()
	{
		
	}
	public Book(int isbn, String bName,String authorName)
	{
		this.isbn=isbn;
		this.bName=bName;
		this.authorName=authorName;
	}
	
	
	public boolean equals(Object obj)
	{
		Book b3 = (Book)obj;
		
		if(this.isbn ==	 b3.isbn)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return Integer.hashCode(isbn);
	}
	
}
public class Object_Hashcode_And_Equals_Real_Life_Example {

	public static void main(String[] args) {
		
		Book b1 = new Book(112233,"Think Like A Monk ","Jay Shetty");
		Book b2 = new Book(112233,"Think Like A Monk","Radhi Shetty");
		
		
		System.out.println("HashCode of Book B1 :"+System.identityHashCode(b1));
		
		System.out.println("HashCode of Book B2 :"+System.identityHashCode(b2));

		
		if(b1.equals(b2))
		{
			System.out.println("The Book b1 and Book b2 are Equals :");
		}
		else
		{
			System.out.println("The Book b1 and Book b2 are not Equals :");
		}
		
		
		if(b1.hashCode()==b2.hashCode())
		{
			System.out.println("The hashCode of the Two Books are Equals :");
		}
		else
		{
			System.out.println("The HashCode of the Two Books are Not Equals :");
		}
		
		System.out.println("The UserDefined Hashcode of Book 1 :"+b1.hashCode());
		System.out.println("The UserDefined HashCode  of Book 2 :"+b2.hashCode());
		
	}

}

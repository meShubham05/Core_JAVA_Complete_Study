package OOPS.Inheritance;


class AClass
{
	int  num;
	public void setValue(int num)
	{
		this.num=num;
		
	}
}
class BClass extends AClass
{
	public int show()
	{
		return num;
	}
	
}
public class Single_Inheritance_App {

	public static void main(String[] args) {
		
		BClass b = new BClass();
		b.setValue(10);
		
		int result =b.num;
		
		System.out.println("The result is : "+result);
	}
}

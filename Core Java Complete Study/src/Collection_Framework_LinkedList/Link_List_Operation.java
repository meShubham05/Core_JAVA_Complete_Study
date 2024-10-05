package Collection_Framework_LinkedList;

import java.util.*;
class Product
{
	int pId;
	String pName;
	int pPrice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}	
}
public class Link_List_Operation {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Data in LinkedList ");
		
		System.out.println("Enter the no of Products you want to add :");
		
		int size =sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter product id :");
			int id =sc.nextInt();
			sc.nextInt();
			System.out.println("Enter product Name :");
			String name =sc.nextLine();
			System.out.println("Enter product price :");
			int price =sc.nextInt();
			
			Product p = new Product();
			p.setpId(id);
			p.setpName(name);
			p.setpPrice(price);
			ll.add(p);			
		}
		
		for(Product prod :p)
		{
			Product p2 =prod.getpId()+" "+prod.getpName()+" "+prod.getpPrice();
		}
	}

}

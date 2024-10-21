package Generics;


/*
 
 
Problem 1: Type-Safe Collection of Customer Orders
Scenario:
You are developing an order management system where each customer has a list of orders. 
You need to ensure that only Order objects can be added to the list. 
If anyone tries to add any other type of object, 
it should throw an error at compile time (not runtime),
 which ensures type safety.

This problem emphasizes the usage of Generics to enforce that only Order objects are used,
 avoiding potential type mismatch issues.

Steps to Solve
Define the Order Class:

You need a class Order that represents customer orders.
 This can contain properties such as order ID, product name, and quantity.
Define the Customer Class:

Each customer will have a type-safe collection (like a List<Order>) to store their orders.
You will implement methods to:
Add an order to the customer's list.
Retrieve a specific order by index.
List all orders for a customer.
Use Generics to Ensure Type Safety:

The key here is to use a List<Order>, ensuring that only Order objects can be added.
Generics will give you compile-time type checking.


*/


import java.util.*;

class Order
{
	private int  orderId;
	private String productName;
	private  int quantity;
	
	public Order()
	{
		
	}
	
	public Order(int orderId ,String productName,int quantity)
	{
		this.orderId=orderId;
		this.productName=productName;
		this.quantity=quantity;
		
	}
	
	public int getOrderId()
	{
		return orderId;
	}
	public String productName()
	{
		return productName;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public  String toString()
	{
		return "Order id : "+getOrderId() +" Product Name : "+productName()+" Product Quantity : "+getQuantity();
	}
	
}


class Customer
{
	private String custName;
	private String custMobNo;
	
	ArrayList<Order> list =new ArrayList<Order>(); 
	
	public Customer()
	{
		
	}
	public Customer(String custName,String custMobNo)
	{
		this.custName = custName;
		this.custMobNo = custMobNo;
	}
	
	
	public void addOrder(Order order)
	{
		list.add(order);
		
	}
	
	
	public Order getOrder(int orderIndex)
	{
		return list.get(orderIndex);
	}
	
	
	public String getCustomerName()
	{
		return custName;
	}
	
	public String getCustomerMobileNo()
	{
		return custMobNo;
	}
	
}

public class OrderList_Using_Generics_App 
{

	public static void main(String[] args) 
	{
			
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the no of Customer You want to Add :");
		int size =sc.nextInt();
		sc.nextLine();
		
		Customer [] customer = new Customer[size];
		
		for(int i=0;i<size;i++)
		{
			
			System.out.println("\nEnter customer Details :");
			System.out.println("\n Enter Customer Name :");
			String customerName=sc.nextLine();
			
			System.out.println("\n Enter Customer Mobile Number :");
			
			String custMobNo =sc.nextLine();
			
			sc.nextLine();
			
			
			System.out.println("Enter "+(i+1)+"'st Customer Order");
			customer[i] = new Customer(customerName,custMobNo);
			
			System.out.println("Enter the No of Order You have Purchased :");
			int orderLimit =sc.nextInt();
			sc.nextLine(); 
			Order order[]= new Order[orderLimit];
			
			for(int j=0;j<orderLimit;j++)
			{
			System.out.println("\n Enter Customer Order :");
			System.out.println("\n Enter Order Id :");
			int orderId =sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n Enter Product Name :");
			String productName=sc.nextLine();
			
			System.out.println("Enter Order Quantity :");
			int quantity = sc.nextInt();
			
			order[i]= new Order(orderId,productName,quantity);
			
			customer[i].addOrder(order[i]);	
			
			}
			
		}
		int customerList =1;
		
		for(Customer cus:customer)
		{
			System.out.println(" \n Customer : "+(customerList)+"'s"+"Details :");
			System.out.println("\n Customer Order List Below :");
			for(int i=0;i<cus.list.size();i++)
			{				
				System.out.println(cus.getOrder(i));
			}
			System.out.println();
			customerList++;
			
		}
	}

}

package Collection_Framework_SET___HashSet;

import java.util.*;
class Employee {
	private int id;
	public Employee() {
		
	}
	public Employee(String name,int id,int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	private String name;
	private int sal;
}


public class Employee_HsshSet_Collection {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Employee emp1 = new Employee("ABC",1,10000);
		Employee emp2 = new Employee("MNO",2,20000);
		Employee emp3 = new Employee("PQR",3,30000);
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		for(Object obj:hs) 
		{
			Employee e=(Employee)obj;
	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}


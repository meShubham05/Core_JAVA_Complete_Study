package Collection_Framework_____COLLECTIONS___CLASS;
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

public class Collections___Class_Demo {
		public static void main(String[] args) {
			Employee emp1 = new Employee("ABC",1,1000);
			Employee emp2 = new Employee("MNO",5,6000);
			Employee emp3 = new Employee("PQR",2,3000);
			Employee emp4 = new Employee("STV",4,9000);
			Employee emp5 = new Employee("XYZ",3,500);
			ArrayList al = new ArrayList();
			al.add(emp1);//id ,name,sal
			al.add(emp2);
			al.add(emp3);
			al.add(emp4);
			al.add(emp5);
			System.out.println("Employee Data Before Sorting");
			for(Object obj:al) {
				Employee e=(Employee)obj;
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
			Collections.sort(al);
			System.out.println("Display Employee Data After Sorting");
			for(Object obj:al) {
				Employee e=(Employee)obj;
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
		}

	}

	 


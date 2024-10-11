package Multi_Threading;
import java.util.*;
class Ward{
	private int id,age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void show(Ward[] w) {
		// TODO Auto-generated method stub
	}
	
}
class Voter{
	Ward[] w;
	void setVoter(Ward[] w) 
	{
		this.w=w;
	}
	synchronized void show() {
		try {
			for(int i=0;i<w.length;i++)
			{
				System.out.println(w[i].getId()+"\t"+w[i].getName()+"\t"+w[i].getAge());
			}
		}catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
class WardA extends Thread
{
	Voter v;
	public void setW(Voter v) {
	this.v = v;
	}
	public void run()
	{
		v.show();
	}
}
class WardB extends Thread

{
	Voter v;
	public void setW(Voter v) {
	this.v = v;
	}
	public void run()
	{
		v.show();
	}
}
class WardC extends Thread
{
	Voter v;
	public void setW(Voter v) {
	this.v = v;
	}
	public void run()
	{
		v.show();
	}
}

public class VoterThread 
{

	public static void main(String[] args) {
		Ward w[]=new Ward[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter Voter ID:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Voter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Voter Age:");
		int age = sc.nextInt();
		w[i]=new Ward();
		w[i].setId(id);
		w[i].setName(name);
		w[i].setAge(age);
		}
		Voter v=new Voter();
				v.setVoter(w);
		WardA a1=new WardA();
		a1.setW(v);
		
		a1.start();
		WardB b1=new WardB();
		b1.setW(v);
		System.out.println("Ward B");
		b1.start();
		WardC c1=new WardC();
		c1.setW(v);
		System.out.println("Ward C");
		c1.start();
	}
}

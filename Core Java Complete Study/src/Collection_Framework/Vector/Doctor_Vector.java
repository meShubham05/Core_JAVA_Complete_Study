package Collection_Framework.Vector;

import java.util.*;


class Doctor
{
	int dId,dFees,dRank;
	String dName,dSpeciality,dcity;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public int getdFees() {
		return dFees;
	}
	public void setdFees(int dFees) {
		this.dFees = dFees;
	}
	public int getdRank() {
		return dRank;
	}
	public void setdRank(int dRank) {
		this.dRank = dRank;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdSpeciality() {
		return dSpeciality;
	}
	public void setdSpeciality(String dSpeciality) {
		this.dSpeciality = dSpeciality;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	
}
public class Doctor_Vector {

	public static void main(String[] args) {
		
		int choice =0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Doctors You want to add :");
		
		int size = sc.nextInt();
		
		Doctor d[] = new Doctor[size];
		Vector v = new Vector();
		
		for(int i=0;i<d.length;i++)
		{
			d[i]= new Doctor();
			
			System.out.println("Enter the Doctor id :");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Doctor name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Doctor Speciality :");
			String speciality= sc.nextLine();
			
			
			System.out.println("Enter Doctor city :");
			String city = sc.nextLine();
			
			System.out.println("Enter Doctor fees :");
			int fees = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Doctor Rank:");
			int rank = sc.nextInt();
		
			d[i].setdId(id);
			d[i].setdName(name);
			d[i].setdSpeciality(speciality);
			d[i].setDcity(city);
			d[i].setdFees(fees);
			d[i].setdRank(rank);
			
			v.add(d[i]);
		}
		
		do
		{
			System.out.println("1 : Display all Doctors :");
			System.out.println("2 : Add new Doctor :");
			System.out.println("3 : Update Doctor Details :");
			System.out.println("4 : Delete Doctor by Id :");
			System.out.println("5 : Sort Doctor in Ascending order by Id :");
			System.out.println("6 : Search doctor by using it's speciality :");
			
			switch(choice)
			{
				case 1:
					Iterator i = v.iterator();
					
					while(i.hasNext())
					{
						Object obj =i.next();
						Doctor d2=(Doctor)obj;
						System.out.println("Doctor Id :"+d2.getdId());
						System.out.println("Doctor Name :"+d2.getdName());
						System.out.println("Doctor Speciality :"+d2.getdSpeciality());
						System.out.println("Doctor City :"+d2.getDcity());
						System.out.println("Doctor Fees "+d2.getdFees());
						System.out.println("Doctor Rank"+d2.getdRank());
					
					}
					break;
					
				case 2:
					
					Doctor  d3 =new Doctor();
					
					System.out.println("Enter doctor Id :");
					int id =sc.nextInt();
					
					System.out.println("Enter Doctor Name :");
					String name =sc.nextLine();
					
					System.out.println("Enter Doctor speciality :");
					String speciality = sc.nextLine();
					
					System.out.println("Enter Doctor city :");
					String city = sc.nextLine();
					
					System.out.println("Enter Doctor Fees :");
					int fees  = sc.nextInt();
					
					System.out.println("Enter Doctor Rank :");
					int rank = sc.nextInt();
					
					v.add(d3);
					
					
					break;
					
				case 3:
					
					System.out.println("Which Field you want to update :");
					
					System.out.println("1: Id  2: Name 3:Speciality 4:City 5:Fees 6:Rank ");
					do
					{
						switch(choice)
						{
							case 1:
									
									System.out.println("Enter the New Id :");
									int id4 = sc.nextInt();
									doctor  .setdId(id4);
									System.out.println("Id Updated successfully :");
									
							break;
							
							case 2:
								
								System.out.println("Enter the Name of the doctor you want to update :");
								String name3 = sc.nextLine();
								
							
							d3.setdName(name3);
								System.out.println("Name updated Successfully  :");
								;
						}
					}while(choice!=0);
					
					
					break;
					
				case 4:
					
					System.out.println("Enter the id pf the Doctor you want ro remove form database :");

					int id2 =sc.nextInt();
					
						i=v.iterator();
						
					while(i.hasNext())
					{
						Object obj = i.next();
						Doctor d4 =(Doctor)obj;
						if(d4.getdId()==id2)
						{
							i.remove();
						}
					}
					
					System.out.println("Remove Doctor Successfully :");
				
					break;
					
				case 5:
					
					System.out.println("After Sorting the Doctor by it's ID :");
					
					i=v.iterator();
					
					for(int i=0;i<d.length;i++)
					{
						for(int j=i+1;j<d.length;j++)
						{
							Object prev =v.get(i);
							Object next = v.get(j);
							
							if((int)prev>(int)next)
							{
								v.set(i, next);
								v.set(j, prev);
							}
						}
						System.out.println();
					}
					
					
					
					
			}
			
			
		}while(choice!=0);
	}

}

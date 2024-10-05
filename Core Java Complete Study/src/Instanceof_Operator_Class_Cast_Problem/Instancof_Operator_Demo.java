package Instanceof_Operator_Class_Cast_Problem;

import java.sql.Date;
import java.util.*;
public class Instancof_Operator_Demo {

public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	
	al.add(12);
	
	al.add("abc");
		
	al.add(1.2f);
	
	al.add(new java.util.Date());
	
	al.add(50);
	int sum =0;
	for(Object obj: al)
	{
		if(obj instanceof Integer)
		{
			sum =sum+(int )obj;
		}
	}
	
	System.out.println("The sum  is :"+sum);
}
}

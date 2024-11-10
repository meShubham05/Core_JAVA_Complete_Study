package Java8Features;


import java.util.*;
import java.util.function.Consumer;



class Payment implements Bank,NetBanking
{

	@Override
	public void paymentNetBanking() {
		System.out.println("Welcome to PaymentNetBanking  Service through Mobile:");
		
	}

	@Override
	public void paymetService() {
		System.out.println("Welcome to PaymentService through Bank : ");
	}
	
}

public class Consumer_Demo1 
{
public static void main(String[] args) 
{		Payment pay = new Payment();
		pay.paymetService();
		pay.paymentNetBanking();
		
		
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
//		list.forEach((Object obj)->System.out.println(obj));
		
		Consumer con = new Consumer () {

		
			public void accept(Object t) {
				
				System.out.println(t);
				
			}
		};
			list.forEach(con);
			
		
		
		List<String> list2 = Arrays.asList("AAA","BBB","CCC","DDD");
		
		Consumer con2 = (Object t) ->System.out.println(t);
						
				
		list2.forEach(con2);
		
	}
}
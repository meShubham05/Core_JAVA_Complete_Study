package Java8Features;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.function.Supplier;

public class Supplier__Functional__InterfaceDemo {
    public static void main(String[] args) {
    
    	Supplier<Date> sup = new Supplier<Date>() 
    	{
            public Date get() 
            {
                return new Date(System.currentTimeMillis()); // Correct way to create current date
            }
        };
        
        Supplier<String> message = new Supplier<String>()
        		{
        			public String get()
        			{
        				return "I am Supplier Message ";
        			}
        		};
        
        	System.out.println(message.get());
        		
        		
        
        
        Date d1 = sup.get();      
        System.out.println("Today's date: " + d1);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        String formattedDate = sdf.format(d1);
        System.out.println("Today's date and time: " + formattedDate);
        
    }
}

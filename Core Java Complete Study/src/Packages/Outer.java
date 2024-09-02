package Packages;

 class Outer {

	 class Inner
	 {
		 public void show()
		 {
			 System.out.println("I am Show Method in Inner class :");
			 
		 }
	 }
	 
	 
	 public static void main(String x[])
	 {
		Outer o = new Outer();
		Outer.Inner i =o.new Inner();
		i.show();
		
		
	 }
}

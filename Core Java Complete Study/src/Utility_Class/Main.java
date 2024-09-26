package Utility_Class;

 public final class Main {

	   
	    private Main() {
	        throw new UnsupportedOperationException("Utility class cannot be instantiated");
	    }


	    public static int add(int a, int b) {
	        return a + b;
	    }

	
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    
	    public static int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = Main.add(num1, num2);
        int difference = Main.subtract(num1, num2);
        int product = Main.multiply(num1, num2);
        int maximum = Main.max(num1, num2);

        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Product: " +product);
        System.out.println("Maximum: " +maximum);
    }
}


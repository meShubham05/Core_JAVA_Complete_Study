package Utility_Class;

 public final class Main {

	    // Private constructor to prevent instantiation
	    private Main() {
	        throw new UnsupportedOperationException("Utility class cannot be instantiated");
	    }

	    // Method to add two numbers
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    // Method to subtract two numbers
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    // Method to multiply two numbers
	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    // Method to find the maximum of two numbers
	    public static int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Using utility methods from MathUtils
        int sum = Main.add(num1, num2);
        int difference = Main.subtract(num1, num2);
        int product = Main.multiply(num1, num2);
        int maximum = Main.max(num1, num2);

        // Print the results
        System.out.println("Sum: " +sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Maximum: " + maximum);
    }
}


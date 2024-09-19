package Interfaces;

interface Payment {
    public void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("You are paying through Credit Card.");
    }
}

class PaymentService {
    private Payment payment;

    // Default constructor is not required, can be omitted
    public PaymentService() {
    }

    // Constructor injection for loose coupling
    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    // Setter method for loose coupling via method injection
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // Method that invokes the payment logic
    public void paymentService() {
        if (payment != null) {
            payment.pay();
        } else {
            System.out.println("Payment method not provided.");
        }
    }

    public static void main(String[] args) {
        // PaymentService instance without payment method (to show method injection)
        PaymentService paymentService = new PaymentService();
        paymentService.paymentService();  // This will show "Payment method not provided."
        
        // Injecting the payment method via setter
        paymentService.setPayment(new CreditCardPayment());
        paymentService.paymentService();  // This will execute the payment logic via CreditCardPayment

        // Injecting the payment method via constructor (alternate approach)
        PaymentService paymentServiceWithConstructor = new PaymentService(new CreditCardPayment());
        paymentServiceWithConstructor.paymentService();  // This will also execute the payment logic
    }
}

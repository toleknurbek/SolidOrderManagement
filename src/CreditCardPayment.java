class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Payment via Credit Card: " + amount);
    }
}
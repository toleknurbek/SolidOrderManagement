class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Payment via PayPal: " + amount);
    }
}
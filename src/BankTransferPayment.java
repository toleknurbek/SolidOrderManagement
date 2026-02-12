class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Payment via Bank Transfer: " + amount);
    }
}
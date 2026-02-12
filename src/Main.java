public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new Product("Smartphone", 50000));
        order.addProduct(new Product("Case", 5000));

        IPayment payment = new CreditCardPayment();
        IDelivery delivery = new CourierDelivery();

        order.setPaymentMethod(payment);
        order.setDeliveryMethod(delivery);

        DiscountCalculator calculator = new DiscountCalculator();
        INotification sms = new SmsNotification();

        order.process(calculator, sms);
    }
}
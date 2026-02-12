import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Product> products = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void process(DiscountCalculator calculator, INotification notification) {
        double total = calculateTotal();
        double discount = calculator.calculateDiscount(total);
        double finalAmount = total - discount;

        paymentMethod.processPayment(finalAmount);
        deliveryMethod.deliverOrder(this);
        notification.sendNotification("Order processed. Total: " + finalAmount);
    }
}
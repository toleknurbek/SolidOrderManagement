class DiscountCalculator {
    public double calculateDiscount(double totalAmount) {
        if (totalAmount > 10000) {
            return totalAmount * 0.1;
        }
        return 0;
    }
}
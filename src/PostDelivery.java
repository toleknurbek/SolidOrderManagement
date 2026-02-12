class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Sending via Post Office.");
    }
}
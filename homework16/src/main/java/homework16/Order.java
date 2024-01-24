package homework16;

public class Order {

    private long orderNumber;
    private String clientName;

    public Order(long orderNumber, String clientName) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return
                orderNumber + " | " + clientName;
    }
}

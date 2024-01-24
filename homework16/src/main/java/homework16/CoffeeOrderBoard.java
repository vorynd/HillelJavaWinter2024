package homework16;

import java.util.ArrayList;
import java.util.List;


public class CoffeeOrderBoard {
    private List<Order> orderList = new ArrayList<>();
    private long orderCount = 0;

    public void add(String clientName) {
        orderList.add(new Order(orderCount++, clientName));
    }

    public Order deliver() {
        Order order = orderList.get(0);
        orderList.remove(0);
        return order;
    }

    public Order deliver(long orderNumber) {
        Order order = null;
        for (Order o : orderList) {
            if (orderNumber == o.getOrderNumber()) {
                order = o;
            }
        }
        orderList.remove(order);
        return order;
    }

    public void draw(){
        System.out.println("Number | Name");
        orderList.forEach(System.out::println);
        System.out.println();
    }

}

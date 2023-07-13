package chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

    private OrderStatus status = OrderStatus.PREPARING;

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).map(OrderStatus::name).forEach(System.out::println);
    }

}

package entities;

import entitiesEnum.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> orders = new ArrayList<>();

    public Order(String moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrder() {
        return orders;
    }

    public void addItem(OrderItem order){
        orders.add(order);
    }

    public void removeItem(OrderItem order){
        orders.remove(order);
    }

    public double total(){

        double sum = 0.0;

        for (OrderItem i : orders){
            sum += i.getPrice() * i.getQuantity();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + getMoment() + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append(getClient() + "\n");
        sb.append("Order items:" + "\n");
        for (OrderItem i : orders){
            sb.append(i + "\n");
        }

        sb.append("Total price: $" + total());

        return sb.toString();
    }
}

package entities;

import java.util.Date;

public class Order {

    private Date date;
    private Product product;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
    }
    

}

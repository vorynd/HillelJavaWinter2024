package homework18;


import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
    private Type type;
    private double price;
    private boolean discountPossible;

    private LocalDateTime date;

    public Product(Type type, double price, boolean discountPossible, LocalDateTime date) {
        this.type = type;
        this.price = price;
        this.discountPossible = discountPossible;
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountPossible() {
        return discountPossible;
    }

    public void setDiscountPossible(boolean discountPossible) {
        this.discountPossible = discountPossible;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price +
                ", discountPossible=" + discountPossible +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && discountPossible == product.discountPossible && type == product.type && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, discountPossible, date);
    }
}

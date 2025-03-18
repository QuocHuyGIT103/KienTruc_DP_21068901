package composite;

public class Product implements Component {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getRevenue() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}

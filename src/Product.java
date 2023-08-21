// Принцип единственной ответственности:
// Класс Product отвечает только за хранение информации о товаре.
public class Product {
    private String name;
    private String description;
    private double price;
    private String manufacturer;

    public Product(String name, String description, double price, String manufacturer) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

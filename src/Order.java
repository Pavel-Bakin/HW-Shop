import java.util.ArrayList;
import java.util.List;

// Принцип инверсии зависимостей:
// Класс Order зависит от абстракции (DiscountStrategy), а не от конкретной реализации.
class Order implements IOrderable {
    private User user;
    private List<Product> products;
    private DiscountStrategy discountStrategy;

    public Order(User user, DiscountStrategy discountStrategy) {
        this.user = user;
        this.products = new ArrayList<>();
        this.discountStrategy = discountStrategy;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public double calculateTotal() {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        return discountStrategy.applyDiscount(total);
    }
}

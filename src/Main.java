// Принцип открытости/закрытости:
// Класс Order закрыт для модификации, но открыт для расширения через стратегии скидок.
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Petya", "Sovetskaya St");
        DiscountStrategy discountStrategy = new FixedDiscount(30.0);
        IOrderable order = new Order(user, discountStrategy);

        Product product1 = new Product("Phone", "Smartphone", 500.0, "Iphone");
        Product product2 = new Product("Laptop", "Gaming laptop", 1200.0, "HP");

        order.addProduct(product1);
        order.addProduct(product2);

        System.out.println("Общая сумма после скидки: $" + order.calculateTotal());
    }
}
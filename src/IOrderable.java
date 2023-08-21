// Принцип разделения интерфейса:
// Интерфейс IOrderable содержит методы, связанные только с заказами.
public interface IOrderable {
    void addProduct(Product product);

    double calculateTotal();
}

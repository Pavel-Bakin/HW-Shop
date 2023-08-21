// Принцип подстановки Барбары Лисков:
// DiscountStrategy можно подставить вместо любой конкретной стратегии скидок.
interface DiscountStrategy {
    double applyDiscount(double total);
}

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total;
    }
}

class FixedDiscount implements DiscountStrategy {
    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double total) {
        return total - discountAmount;
    }
}
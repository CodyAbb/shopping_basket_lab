package Discount;

public class TenPercent implements IDiscountable{

    public double applyDiscount(double value) {
        return value *= 0.9;
    }
}

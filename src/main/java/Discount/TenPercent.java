package Discount;

import Item.Item;
import ShoppingBasket.ShoppingBasket;

import java.util.ArrayList;

public class TenPercent implements IDiscountable{

    public double applyDiscount(ShoppingBasket shoppingBasket, boolean loyaltyCard) {
        double newTotal = shoppingBasket.getSubTotalBasket();
        if (newTotal > 20.00){
            return newTotal *= 0.9;
        } else {
            return newTotal;
        }
    }
}

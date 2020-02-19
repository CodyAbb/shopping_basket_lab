package Discount;

import Item.Item;
import ShoppingBasket.ShoppingBasket;

import java.util.ArrayList;

public class LoyaltyDiscount {

    public double applyDiscount(ShoppingBasket shoppingBasket, boolean loyaltyCard) {
        if (loyaltyCard = true){
            double newTotal = shoppingBasket.getSubTotalBasket();
            return newTotal *= 0.98;
        } else {
            return shoppingBasket.getSubTotalBasket();
        }
    }
}

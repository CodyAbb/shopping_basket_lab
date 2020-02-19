package Discount;

import Item.Item;
import ShoppingBasket.ShoppingBasket;

import java.util.ArrayList;

public interface IDiscountable {
    public double applyDiscount(ShoppingBasket shoppingBasket, boolean loyaltyCard);
}

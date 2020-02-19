package ShoppingBasket;

import Discount.IDiscountable;
import Item.Item;

import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;
    private double basketTotal;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItemToBasket(Item item){
        this.items.add(item);
    }

    public double getSubTotalBasket() {
        double total = 0;
        for (Item item : this.items){
            total += item.getValue();
        }
        return total;
    }


    public int getNumberOfItems(){
        return this.items.size();
    }


}

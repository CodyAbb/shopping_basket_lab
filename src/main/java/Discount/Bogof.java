package Discount;

import Item.Item;
import ShoppingBasket.ShoppingBasket;

import java.util.ArrayList;
import java.util.HashMap;

public class Bogof {
    public double applyDiscount(ShoppingBasket shoppingBasket, boolean loyaltyCard) {
        double total = shoppingBasket.getSubTotalBasket();
        ArrayList<Item> basketItems = shoppingBasket.getItems();
//        HashMap<Item, Integer> itemCount = new HashMap<Item, Integer>();

        ArrayList<Item> oddsRemoved = new ArrayList<Item>();
        for (Item item : basketItems){
            for (Item Odditem : oddsRemoved){
                if (!(item.equals(Odditem))){
                    oddsRemoved.add(item);
                }
            }
        }

        double newTotal = 0;

        for (Item item : oddsRemoved){
            newTotal += item.getValue();
        }

        return newTotal;

//        HashMap<Item,Integer> itemCount = new HashMap<Item,Integer>();
//        for(Item item : basketItems) {
//            Integer i = itemCount.get(item);
//            if(i == null) itemCount.put(item, 1);
//            else itemCount.put(item, i + 1);
//        }




    }
}

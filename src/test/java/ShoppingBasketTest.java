import Discount.IDiscountable;
import Discount.TenPercent;
import Item.Item;
import ShoppingBasket.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShoppingBasketTest {

    private Item itemSoap;
    private Item itemBread;
    private ShoppingBasket shoppingBasket;
    private IDiscountable tenPercent;

    @Before
    public void before(){
        itemSoap = new Item("soap", 0.99);
        itemBread = new Item("bread", 1.48);
        shoppingBasket = new ShoppingBasket();
        tenPercent = new TenPercent();
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, shoppingBasket.getNumberOfItems());
    }

    @Test
    public void canAddToBasket(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        assertEquals(2, shoppingBasket.getNumberOfItems());
    }

    @Test
    public void canGetShoppingBasketAmountWithoutDiscount(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        assertEquals(2.47, shoppingBasket.getSubTotalBasket(), 0.01);
    }

    @Test
    public void applyTenPercentDiscount(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        assertEquals(2.22, shoppingBasket.getDiscountedTotal(tenPercent), 0.01);
    }
}

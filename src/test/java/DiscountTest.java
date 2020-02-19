import Discount.IDiscountable;
import Discount.TenPercent;
import Item.Item;
import ShoppingBasket.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiscountTest {

    private Item itemSoap;
    private Item itemBread;
    private Item itemMicrowave;
    private ShoppingBasket shoppingBasket;
    private IDiscountable tenPercent;

    @Before
    public void before(){
        itemSoap = new Item("soap", 0.99);
        itemBread = new Item("bread", 1.48);
        itemMicrowave = new Item("microwave", 40.00);
        shoppingBasket = new ShoppingBasket();
        tenPercent = new TenPercent();
    }

    @Test
    public void canGetShoppingBasketAmountWithoutDiscount(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        assertEquals(2.47, shoppingBasket.getSubTotalBasket(), 0.01);
    }

    @Test
    public void doesNotApplyTenPercent(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        assertEquals(2.47, tenPercent.applyDiscount(shoppingBasket, false), 0.01);
    }

    @Test
    public void doesApplyTenPercent(){
        shoppingBasket.addItemToBasket(itemSoap);
        shoppingBasket.addItemToBasket(itemBread);
        shoppingBasket.addItemToBasket(itemMicrowave);
        assertEquals(38.22, tenPercent.applyDiscount(shoppingBasket, false), 0.01);
    }

}

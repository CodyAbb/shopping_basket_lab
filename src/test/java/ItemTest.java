import Item.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    private Item item;

    @Before
    public void before() {
        item = new Item("soap", 1.99);
    }

    @Test
    public void canGetName(){
        assertEquals("soap", item.getName());
    }

    @Test
    public void canGetValue(){
        assertEquals(1.99, item.getValue(), 0.01);
    }
}

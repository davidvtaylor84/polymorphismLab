import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(90.00);
    }

    @Test
    public void canDeductBalance(){
        giftCard.charge(10.50);
        assertEquals(79.50, giftCard.getBalance(), 0.1);
    }

}

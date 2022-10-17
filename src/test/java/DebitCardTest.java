import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(23456, "12/24", 890, 12345678, 123456);
    }

    @Test
    public void hasCardNumber(){
        assertEquals(23456, debitCard.getCardNumber());
    }

    @Test
    public void hasExpDate(){
        assertEquals("12/24", debitCard.getExpDate());
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(890, debitCard.getSecurityNumber());
    }

    @Test
    public void hasAccNumber(){
        assertEquals(12345678, debitCard.getAccNumber());
    }

    @Test
    public void hasSortCode(){
        assertEquals(123456, debitCard.getSortCode());
    }

}

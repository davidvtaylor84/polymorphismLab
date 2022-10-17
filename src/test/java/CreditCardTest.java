import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(12345, "10/23", 699, 400.50);
    }

    @Test
    public void hasCardNumber(){
        assertEquals(12345, creditCard.getCardNumber());
    }

    @Test
    public void hasExpDate(){
        assertEquals("10/23", creditCard.getExpDate());
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(699, creditCard.getSecurityNumber());
    }

    @Test
    public void hasAvailCredit(){

        assertEquals(400.50, creditCard.getAvailCredit(), 0.0);
    }

    @Test
    public void canCharge(){
        creditCard.charge(24);
        assertEquals(1, creditCard.transCount());
    }

    @Test
    public void canReduceCredit(){
        creditCard.charge(25.50);
        assertEquals(373.72, creditCard.getAvailCredit(), 0.1);
    }

    @Test
    public void canCalculateWithPercentageAdded(){
         creditCard.charge(25.50);
         assertEquals(373.72, creditCard.getAvailCredit(), 0.1);
    }



}

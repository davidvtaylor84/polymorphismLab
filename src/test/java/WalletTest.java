import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before(){
        wallet = new Wallet();
        creditCard = new CreditCard(12345, "10/23", 699, 400.50);
        debitCard = new DebitCard(23456, "12/24", 890, 12345678, 123456);
        giftCard = new GiftCard(90.00);
        wallet.addNewPaymentMethod("bank of scotland", creditCard);
        wallet.addNewPaymentMethod("TSB", debitCard);
    }

    @Test
    public void canAddNewPaymentMethod(){
        wallet.addNewPaymentMethod("Tesco Card", giftCard);
        assertEquals(3, wallet.paymentMethodCount());
    }

    @Test
    public void canSelectPayment(){
        wallet.setSelectedPayment("bank of scotland");
        assertEquals(creditCard, wallet.getSelectedPaymentType());
    }

    @Test
    public void canPay(){
        wallet.setSelectedPayment("bank of scotland");
        wallet.pay(100);
        assertEquals(295.5, creditCard.getAvailCredit(), 0.0);
    }

}



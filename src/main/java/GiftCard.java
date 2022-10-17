public class GiftCard implements IChargeable {

    private int balance;

    public GiftCard(int balance){
        this.balance = balance;
    }


    @Override
    public void charge(double purchaseAmount) {
        balance -= purchaseAmount;
    }
}

public class GiftCard implements IChargeable {

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }


    @Override
    public void charge(double purchaseAmount) {
        balance -= purchaseAmount;
    }


    public double getBalance() {
        return balance;
    }
}

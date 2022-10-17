public class CreditCard extends PaymentCard {

    private double availCredit;

    public CreditCard(int cardNumber, String expDate, int securityNumber, double availCredit) {
        super(cardNumber, expDate, securityNumber);
        this.availCredit = availCredit;
    }

    @Override
    public void charge(double purchaseAmount) {
        this.setTransactionLogs(purchaseAmount);
        availCredit -= purchaseAmount;
    }

    public double getAvailCredit() {
        return availCredit;
    }
}

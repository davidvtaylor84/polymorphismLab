public class CreditCard extends PaymentCard {

    private double availCredit;

    public CreditCard(int cardNumber, String expDate, int securityNumber, double availCredit) {
        super(cardNumber, expDate, securityNumber);
        this.availCredit = availCredit;
    }

    @Override
    public void charge(double purchaseAmount) {
        double percentageAdded = purchaseAmount * 0.05;
        double total = percentageAdded + purchaseAmount;
        this.setTransactionLogs(total);
        availCredit -= total;
    }

    public double getAvailCredit() {
        return availCredit;
    }
}

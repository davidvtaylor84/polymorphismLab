public class DebitCard extends PaymentCard {

    private int accNumber;
    private int sortCode;


    public DebitCard(int cardNumber, String expDate, int securityNumber, int accNumber, int sortCode){
        super(cardNumber, expDate, securityNumber);
        this.accNumber = accNumber;
        this.sortCode = sortCode;
    }

    @Override
    public void charge(double purchaseAmount) {
        this.setTransactionLogs(purchaseAmount);
    }

    public int getAccNumber(){
        return accNumber;
    }

    public int getSortCode(){
        return sortCode;
    }
}

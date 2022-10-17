import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    private int cardNumber;
    private String expDate;
    private int securityNumber;
    private ArrayList<Double> transactionLogs;

    public PaymentCard(int cardNumber, String expDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.securityNumber = securityNumber;
        this.transactionLogs = new ArrayList<>();
    }

    public void setTransactionLogs(double log) {
        transactionLogs.add(log);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getTransactionLogs() {
        return transactionLogs;
    }

    public int transCount(){
        return transactionLogs.size();
    }


}

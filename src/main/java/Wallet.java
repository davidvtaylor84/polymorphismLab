import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Wallet  {

    private String nameOfPaymentMethod;
    private HashMap<String, IChargeable> paymentMethods;

    public Wallet(){
        this.paymentMethods = new HashMap<>();}

    public void addNewPaymentMethod(String name, IChargeable paymentType){
        paymentMethods.put(name, paymentType);
    }

    public int paymentMethodCount(){
        return paymentMethods.size();
    }

    public void setSelectedPayment(String paymentName){
        this.nameOfPaymentMethod = paymentName;
    }

    public void pay(double payment){
        paymentMethods.get(nameOfPaymentMethod).charge(payment);
    }

    public IChargeable getSelectedPaymentType(){
        return paymentMethods.get(nameOfPaymentMethod);
    }

}

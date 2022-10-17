import java.util.ArrayList;

public class Wallet  {

        private ArrayList<IChargeable> paymentOptions;
        private String paymentMethod;

        public Wallet(String paymentMethod){
            this.paymentOptions = new ArrayList<>();
            this.paymentMethod = paymentMethod;
        }



}

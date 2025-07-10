package Package;
import java.util.ArrayList;

public class Customer {
    private ArrayList<String> billingInformation;
    private String shoppingCart;

    public Customer() {
        billingInformation = new ArrayList<>();
        shoppingCart = "";
    }

    public ArrayList<String> getBillingInformation() {return billingInformation;}
    public void getShoppingCart() {shoppingCart = "";}
    public void addBillingInformation(String billingInformation) {this.billingInformation.add(billingInformation);}
    public void removeBillingInformation(String billingInformation) {this.billingInformation.remove(billingInformation);}
    public void setShoppingCart(String shoppingCart) {this.shoppingCart = shoppingCart;}


}

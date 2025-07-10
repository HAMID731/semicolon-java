package Package;

import java.util.ArrayList;

public class Seller {
    private  ArrayList<String> products;

    public Seller(){
        products = new ArrayList<>();
    }

    public ArrayList<String> getProducts(){
        return products;
    }
    public void addProduct(String product){
        products.add(product);
    }
    public void removeProduct(String product){
        products.remove(product);
    }
}

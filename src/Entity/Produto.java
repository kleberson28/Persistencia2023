package Entity;

import java.sql.Date;
import java.util.HashMap;

public class Produto {

    private int id;
    private String name;
    private String type;
    private double price;
    private Date validityData;
    private HashMap<String, String> productStock;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
     public Date getValidityData() {
        return validityData;
    }
    public HashMap<String, String> getProductStock() {
        return productStock;
    }

    public Produto(int id, String name, String type, double price,Date validityDate, HashMap<String, String> productStock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.validityData = validityDate;
        this.productStock = productStock;
    }

    @Override
    public String toString() {
        return "Produto [id=" + getId() + ", name=" + getName() + ", type=" + getType() + ", price=" + getPrice() + ", validityData=" + getValidityData() +", productStock="
                + getProductStock() + "]";
    }
   
}

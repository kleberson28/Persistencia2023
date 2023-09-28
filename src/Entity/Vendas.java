package Entity;

import java.sql.Date;
import java.util.HashMap;

public class Vendas {

    private Date date;
    private Client client;
    private HashMap<String,Produto> historicSales;
    
    public Date getDate() {
        return date;
    }
    public Client getClient() {
        return client;
    }
    public HashMap<String, Produto> getHistoricSales() {
        return historicSales;
    }
    
    public Vendas(Date date, Client client, HashMap<String, Produto> historicSales) {
        this.date = date;
        this.client = client;
        this.historicSales = historicSales;
    }
    
    @Override
    public String toString() {
        return "Vendas [date=" + getDate() + ", client=" + getClient() + ", historicSales=" + getHistoricSales() + "]";
    }
        
}

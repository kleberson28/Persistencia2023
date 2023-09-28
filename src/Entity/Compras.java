package Entity;

import java.sql.Date;
import java.util.HashMap;

public class Compras {
    
    private Date data;
    private HashMap<String,Fornecedor> fornecedor;
    private HashMap<String,Produto> produtos;
    
    public Date getData() {
        return data;
    }
    public HashMap<String, Fornecedor> getFornecedor() {
        return fornecedor;
    }
    public HashMap<String, Produto> getProdutos() {
        return produtos;
    }
    
    public Compras(Date data, HashMap<String, Fornecedor> fornecedor, HashMap<String, Produto> produtos) {
        this.data = data;
        this.fornecedor = fornecedor;
        this.produtos = produtos;
    }
    
    @Override
    public String toString() {
        return "Compras [data=" + getData() + ", fornecedor=" + getFornecedor() + ", produtos=" + getProdutos() + "]";
    }
        
}

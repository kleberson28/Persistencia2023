package Entity;

import java.util.HashMap;

public class Fornecedor{
    
    private int id;
    private String name;
    private String foneNumber;
    private String email;
    private HashMap<String,String> mapProcut;
    private String cnpj;
    private Endereco endereco;
   
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getFoneNumber() {
        return foneNumber;
    }
    public String getEmail() {
        return email;
    }
    public HashMap<String, String> getMapProcut() {
        return mapProcut;
    }
    public String getCnpj() {
        return cnpj;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    
    public Fornecedor(int id, String name, String foneNumber, String email, HashMap<String, String> mapProcut,
            String cnpj, Endereco endereco) {
        this.id = id;
        this.name = name;
        this.foneNumber = foneNumber;
        this.email = email;
        this.mapProcut = mapProcut;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Fornecedor [id=" + getId() + ", name=" + getName() + ", foneNumber=" + getFoneNumber() + ", email=" + getEmail()
                + ", mapProcut=" + getMapProcut() + ", cnpj=" + getCnpj() + ", endereco=" + getEndereco() + "]";
    }


}
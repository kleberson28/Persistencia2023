package Entity;

public class Client {

    private int id;
    private String name;
    private String cpf;
    private String foneNumber;
    private String email;
    private Endereco endereco;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getFoneNumber() {
        return foneNumber;
    }
    public String getEmail() {
        return email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    
    public Client(int id, String name, String cpf, String foneNumber, String email, Endereco endereco) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.foneNumber = foneNumber;
        this.email = email;
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Client [id=" + getId() + ", name=" + getName() + ", cpf=" + getCpf() + ", foneNumber=" + getFoneNumber() + ", email="
                + getEmail() + ", endereco=" + getEndereco() + "]";
    } 
    
}

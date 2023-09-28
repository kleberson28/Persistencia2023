package Entity;

public class Endereco {
    
    private String cep;
    private String number;
    private String streetName;
    private String bairro;
    private String city;
    private String state;
    private String country;
   
    public String getCep() {
        return cep;
    }
    public String getNumber() {
        return number;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
   
    public Endereco(String cep, String number, String streetName, String bairro, String city, String state,
            String country) {
        this.cep = cep;
        this.number = number;
        this.streetName = streetName;
        this.bairro = bairro;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Endereco [cep=" + getCep()+ ", number=" +getNumber()  + ", streetName=" + getStreetName() + ", bairro=" + getBairro()
                + ", city=" + getCity() + ", state=" + getState() + ", country=" + getCountry() + "]";
    }

}

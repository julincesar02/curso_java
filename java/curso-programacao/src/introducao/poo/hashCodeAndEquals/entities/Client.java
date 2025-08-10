package introducao.poo.hashCodeAndEquals.entities;

public class Client {
    private String username;
    private String email;
    private Double conta;

    public Client(){}

    public Client(String username, String email, Double conta) {
        this.username = username;
        this.email = email;
        this.conta = conta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getConta() {
        return conta;
    }

    public void setConta(Double conta) {
        this.conta = conta;
    }

}

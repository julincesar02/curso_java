package entities;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private Double saldo;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String email, Double saldo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "id = " + id +
                ", nome = '" + nome + '\'' +
                ", email = '" + email + '\'';
    }
}

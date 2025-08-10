package entities;

public class Produto {
    private Integer id;
    private String nome;
    private Double price;
    private Integer estoque;

    public Produto() {
    }

    public Produto(Integer id, String nome, Double price , Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.price = price;
        this.estoque = estoque;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}

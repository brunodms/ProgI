package Computador.Pecas;

public class PecaComputador {
    private String nome;
    private String marca;
    private Double preco;

    public String getNome() {
        return this.nome;
    }
    public String getMarca() {
        return this.marca;
    }
    public Double getPreco() {
        return this.preco;
    }
    public PecaComputador(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}

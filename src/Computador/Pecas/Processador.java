package Computador.Pecas;

public class Processador extends PecaComputador{
    private int nucleos;
    private String socket;
    private double clock;

    public Processador(String nome, String marca, double preco, int nucleos, String socket, double clock) {
        super(nome, marca, preco);
        this.nucleos = nucleos;
        this.socket = socket;
        this.clock = clock;
    }

    public int getNucleos() {
        return this.nucleos;
    }
    public String getSocket() {
        return this.socket;
    }
    public double getClock() {
        return this.clock;
    }
}

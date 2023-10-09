package Computador.Pecas;

public class PlacaVideo extends PecaComputador {
    private double clock;
    private int memoria;
    private String tpMemoria;

    public PlacaVideo(String nome, String marca, double preco, double clock, int memoria, String tpMemoria){
        super(nome, marca, preco);
        this.clock = clock;
        this.memoria = memoria;
        this.tpMemoria = tpMemoria;
    }
    public double getClock() {
        return clock;
    }
    public int getMemoria() {
        return memoria;
    }
    public String getTpMemoria() {
        return tpMemoria;
    }
}

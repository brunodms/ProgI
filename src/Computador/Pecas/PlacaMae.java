package Computador.Pecas;

public class PlacaMae extends PecaComputador {
    private String socket;
    private int slotRAM;
    private int slotM2;

    public PlacaMae(String nome, String marca, double preco, String socket, int slotRAM, int slotM2) {
        super(nome, marca, preco);
        this.socket = socket;
        this.slotRAM = slotRAM;
        this.slotM2 = slotM2;
    }
    public String getSocket() {
        return socket;
    }
    public int getSlotRAM() {
        return slotRAM;
    }
    public int getSlotM2() {
        return slotM2;
    }
}

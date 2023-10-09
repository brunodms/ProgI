package ListaProva.imovel;

public class Porta{
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public void setPorta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    public String toString() {
        if (this.aberta == true){
            return "A porta está aberta\n" + "Cor: " + this.cor + ", Dimensões: " + this.dimensaoX + "cm " + this.dimensaoY + "m " + this.dimensaoZ + "cm";
        }else{
            return "A porta está fechada\n" + "Cor: " + this.cor + ", Dimensões: " + this.dimensaoX + "cm " + this.dimensaoY + "m " + this.dimensaoZ + "cm";
        }
    }
    public void abre(){
        this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public void pinta(String cor){
        this.cor = cor;
    }
    public boolean estaAberta(){
        return this.aberta;
    }
}

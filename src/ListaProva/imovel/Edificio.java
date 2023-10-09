package ListaProva.imovel;

public class Edificio extends Imovel{
    int totalPortas;
    int totalAndares;
    Porta portas[];

    public int getTotalPortas(){
        return totalPortas;
    }
    public int getTotalAndares(){
        return totalAndares;
    }
    public void adicionaAndar(){
        this.totalAndares++;
        this.totalPortas += 9;
        this.portas = new Porta[this.totalPortas];
        for(int i = 0; i < this.totalPortas; i++){
            this.portas[i] = new Porta();
            portas[i].setPorta(false, "Branca", 80, 2.10, 3);
        }
    }
}

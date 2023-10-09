package ListaProva.imovel;

public class Casa extends Imovel{
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public void setCasa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    public int quantasPortasEstaoAbertas(){
        int count = 0;
        if (porta1.aberta == true){
            count ++;
        }
        if (porta2.aberta == true){
            count ++;
        }
        if (porta3.aberta == true){
            count ++;
        }
        return count;
    }
}

package ListaProva.pessoa;

public class Data {
    private int DD;
    private int MM;
    private int AAAA;

    public String getDataBR(){
        return this.DD + "/" + this.MM + "/" + this.AAAA;
    }
    public String getDataEUA(){
        return this.MM + "/" + this.DD + "/" + this.AAAA;
    }
    public void setData(int DD, int MM, int AAAA){
        this.DD   = DD;
        this.MM   = MM;
        this.AAAA = AAAA;
    }
}

package ListaProva.pessoa;

public class Pessoa {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String fazAniversario(){
        Data aniver = new Data();
        aniver.setData(10, 10, 2023);

        return aniver.getDataBR();
    }
}

package ListaProva;

import ListaProva.imovel.Porta;
import ListaProva.pessoa.Pessoa;
import ListaProva.imovel.Casa;
import ListaProva.imovel.Edificio;

public class Main {
    public static void main(String[] args){
/* Pessoa */
        Pessoa alexandre = new Pessoa();
        alexandre.setNome("Alexandre");
        alexandre.setIdade(12);
        System.out.println(alexandre.getNome());
        System.out.println(alexandre.getIdade());
        System.out.println(alexandre.fazAniversario());
/* Porta */
        Porta porta = new Porta();
        porta.setPorta(false, "Branca", 80, 2.10, 4);
        System.out.println(porta.toString());
        porta.abre();
        porta.pinta("Preta");
        System.out.println(porta.toString());
/* Casa */
        Porta porta1 = new Porta();
        porta1.setPorta(false, "Branca", 80, 2.10, 4);
        Porta porta2 = new Porta();
        porta2.setPorta(true, "Branca", 82, 2.15, 5);
        Porta porta3 = new Porta();
        porta3.setPorta(false, "Branca", 72, 2, 3);
        Casa casa1 = new Casa();
        casa1.setCasa("Verde", porta1, porta2, porta3);
        casa1.pinta("Azul");
        System.out.println("Na casa tem " + casa1.quantasPortasEstaoAbertas() + " porta(s) aberta(s)");
        porta1.abre();
        System.out.println("Na casa tem " + casa1.quantasPortasEstaoAbertas() + " porta(s) aberta(s)");
/* Edificio */
        Edificio edificio = new Edificio();
        edificio.adicionaAndar();
        edificio.pinta("azul");
        System.out.println("O número total de portas é " + edificio.getTotalPortas());
        System.out.println("O número total de andares é " + edificio.getTotalAndares());
        edificio.adicionaAndar();
        System.out.println("O número total de portas após adicionar um andar é " + edificio.getTotalPortas());
        System.out.println("O número total de andares após adicionar um andar é " + edificio.getTotalAndares());
    }
}

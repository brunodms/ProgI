package calculadora.operacoes;

public class Logaritmacao extends Operacao{

    public Logaritmacao() { 
        super("log");
    }

    @Override
    public double executar(int x, int y) {
        return Math.log(x/y);
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(Math.log(x/y), 2);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(Math.log(x/y), precisao);
    } 
}

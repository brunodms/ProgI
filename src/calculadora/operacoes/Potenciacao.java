package calculadora.operacoes;

public class Potenciacao extends Operacao{

    public Potenciacao() { 
        super("^");
    }

    @Override
    public double executar(int x, int y) {
        return Math.pow(x, y);
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(Math.pow(x, y), 2);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(Math.pow(x, y), precisao);
    } 
}

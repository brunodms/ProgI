package calculadora.operacoes;

public class Radiciacao extends Operacao{

    public Radiciacao() { 
        super("~");
    }

    @Override
    public double executar(int x, int y) {
        return Math.pow(x, 1.0 / y);
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(Math.pow(x, 1.0 / y), 2);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(Math.pow(x, 1.0 / y), precisao);
    } 
}

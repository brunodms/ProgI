package calculadora.operacoes;

public class Resto extends Operacao{
    public Resto() { 
        super("%");
    }

    @Override
    public double executar(int x, int y) {
        return x % y;
    }

    @Override
    public double executar(double x, double y) {
        return this.truncarValor(x % y, 2);
    }

    @Override
    public double executar(double x, double y, int precisao) {
        return this.truncarValor(x % y, precisao);
    } 
}

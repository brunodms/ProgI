package calculadora;

import calculadora.operacoes.Operacao;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtracao;
import calculadora.operacoes.Multiplicacao;
import calculadora.operacoes.Resto;
import calculadora.operacoes.Divisao;
import calculadora.operacoes.Potenciacao;
import calculadora.operacoes.Radiciacao;

public class Main {
    public static void main(String[] args) throws Exception {
        Operacao soma = new Soma();
        double x = 3.5, y = 7.43598374;
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y));
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
        
        Operacao subtracao = new Subtracao();
        System.out.println(x + subtracao.toString() + y + " = " + subtracao.executar(x, y));
        System.out.println(x + subtracao.toString() + y + " = " + subtracao.executar(x, y, 5));
        
        Operacao multiplicacao = new Multiplicacao();
        System.out.println(x + multiplicacao.toString() + y + " = " + multiplicacao.executar(x, y));
        System.out.println(x + multiplicacao.toString() + y + " = " + multiplicacao.executar(x, y, 5));
        
        Operacao resto = new Resto();
        System.out.println(x + resto.toString() + y + " = " + resto.executar(x, y));
        System.out.println(x + resto.toString() + y + " = " + resto.executar(x, y, 5));
        
        Operacao divisao = new Divisao();
        System.out.println(x + divisao.toString() + y + " = " + divisao.executar(x, y));
        System.out.println(x + divisao.toString() + y + " = " + divisao.executar(x, y, 5));
        
        Operacao potenciacao = new Potenciacao();
        System.out.println(x + potenciacao.toString() + y + " = " + potenciacao.executar(x, y));
        System.out.println(x + potenciacao.toString() + y + " = " + potenciacao.executar(x, y, 5));
        
        Operacao radiciacao = new Radiciacao();
        System.out.println(x + radiciacao.toString() + y + " = " + radiciacao.executar(x, y));
        System.out.println(x + radiciacao.toString() + y + " = " + radiciacao.executar(x, y, 5));
    }
}
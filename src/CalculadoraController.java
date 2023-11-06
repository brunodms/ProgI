import calculadora.operacoes.Divisao;
import calculadora.operacoes.Multiplicacao;
import calculadora.operacoes.Operacao;
import calculadora.operacoes.Potenciacao;
import calculadora.operacoes.Radiciacao;
import calculadora.operacoes.Resto;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtracao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {
    @FXML
    private TextField valorX;

    @FXML
    private TextField valorY;

    @FXML
    private Button soma;

    @FXML
    private Button subtracao;

    @FXML
    private Button multiplicacao;

    @FXML
    private Button resto;

    @FXML
    private Button divisao;

    @FXML
    private Button potenciacao;

    @FXML
    private Button radiciacao;

    @FXML
    private Button logaritmacao;

    @FXML
    private TextField resultado;
//--------------------------------------------------------------------------------------------------------------------------------//

    public double getX (TextField valorX) {
        String xString = valorX.getText();
        return Double.parseDouble(xString);
    }

    public double getY (TextField valorY) {
        String yString = valorY.getText();
        return Double.parseDouble(yString);
    }
//--------------------------------------------------------------------------------------------------------------------------------//
    @FXML
    void fazerSoma(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao soma = new Soma();
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
    }

    @FXML
    void fazerSubtracao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao subtracao = new Subtracao();
        System.out.println(x + subtracao.toString() + y + " = " + subtracao.executar(x, y, 5));
    }

    @FXML
    void fazerMultiplicacao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao multiplicacao = new Multiplicacao();
        System.out.println(x + multiplicacao.toString() + y + " = " + multiplicacao.executar(x, y, 5));
    }

    @FXML
    void fazerResto(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao resto = new Resto();
        System.out.println(x + resto.toString() + y + " = " + resto.executar(x, y, 5));
    }

    @FXML
    void fazerDivisao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao divisao = new Divisao();
        System.out.println(x + divisao.toString() + y + " = " + divisao.executar(x, y, 5));
    }

    @FXML
    void fazerPotenciacao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao potenciacao = new Potenciacao();
        System.out.println(x + potenciacao.toString() + y + " = " + potenciacao.executar(x, y, 5));
    }

    @FXML
    void fazerRadiciacao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao radiciacao = new Radiciacao();
        System.out.println(x + radiciacao.toString() + y + " = " + radiciacao.executar(x, y, 5));
    }

    @FXML
    void fazerLogaritmacao(ActionEvent event) {
        double x = getX(valorX);
        double y = getY(valorY);
        Operacao soma = new Soma();
        System.out.println(x + soma.toString() + y + " = " + soma.executar(x, y, 5));
    }
}

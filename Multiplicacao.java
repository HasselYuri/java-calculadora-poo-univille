public class Multiplicacao extends Operacao {
    public Multiplicacao(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        return getNum1() * getNum2();
    }

    @Override
    public String toHistorico() {
        return String.format("%.2f * %.2f = %.2f", getNum1(), getNum2(), calcular());
    }
}
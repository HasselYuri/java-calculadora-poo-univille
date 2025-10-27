public class Soma extends Operacao {
    public Soma(double num1, double num2) {
        super(num1, num2);
    }

    //Lembrança p mais tarde :
    // Não esquecer esse Overrider quando fizer as outras operações, ou vai dar ruim
    @Override
    public double calcular() {
        return getNum1() + getNum2();
    }

    @Override
    public String toHistorico() {
        return String.format("%.2f + %.2f = %.2f", getNum1(), getNum2(), calcular());
    }
}
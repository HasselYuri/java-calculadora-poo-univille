public abstract class Operacao {
    private double num1;
    private double num2;

    public Operacao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double calcular();

    public abstract String toHistorico();

    protected double getNum1() {
        return num1;
    }

    protected double getNum2() {
        return num2;
    }
}
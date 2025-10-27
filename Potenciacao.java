public class Potenciacao extends Operacao {
    public Potenciacao(double base, double expoente) {
        super(base, expoente);
    }

    @Override
    public double calcular() {
        return Math.pow(getNum1(), getNum2());
    }

    @Override
    public String toHistorico() {
        return String.format("%.2f ^ %.2f = %.2f", getNum1(), getNum2(), calcular());
    }
}
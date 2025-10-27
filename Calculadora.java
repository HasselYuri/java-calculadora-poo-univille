import java.util.Scanner;

public class Calculadora {
    private Historico historico;

    private Scanner scanner;

    public Calculadora(Scanner scanner) {
        this.historico = new Historico();
        this.scanner = scanner;
    }

    public void executarCalculo() {
        System.out.print("Insira o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o operador: (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Insira o segundo valor: ");
        double num2 = scanner.nextDouble();

        Operacao operacao = null; // Objeto base para receber a subclasse (Polimorfismo)

        switch (operator) {
            case '+':
                operacao = new Soma(num1, num2);
                break;
            case '-':
                operacao = new Subtracao(num1, num2);
                break;
            case '*':
                operacao = new Multiplicacao(num1, num2);
                break;
            case '/':
                operacao = new Divisao(num1, num2);
                break;
            case '^':
                operacao = new Potenciacao(num1, num2);
                break;
            default:
                System.out.println("Operador Invalido!");
                return;
        }

        try {
            double result = operacao.calcular();
            System.out.printf("Resultado: %.2f\n", result);
            this.historico.adicionarOperacao(operacao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public Historico getHistorico() {
        return historico;
    }
}
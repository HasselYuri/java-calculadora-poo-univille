import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(scanner);

        int escolha = 0;

        do {
            System.out.println("\n+------------------------+");
            System.out.println("+--Calculadora Univille--+");
            System.out.println("+--1° Opção -> Calcular--+");
            System.out.println("+--2° Opção -> Histórico-+");
            System.out.println("+--0° Opção -> Sair------+");
            System.out.println("+--Escolha uma opção-----+");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calculadora.executarCalculo();
                    break;
                case 2:
                    calculadora.getHistorico().mostrarHistorico();
                    break;
                case 0:
                    System.out.println("Saindo da calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
}

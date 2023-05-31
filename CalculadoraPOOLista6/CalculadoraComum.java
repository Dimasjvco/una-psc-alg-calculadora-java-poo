import java.util.Scanner;

public class CalculadoraComum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("\t Calculadora");

        String operation;
        do {
            System.out.println("\nDigite a operação que deseja fazer de acordo com a tabela abaixo ou digite 'Q' para sair:");
            System.out.println("\n Soma\n Subtração\n Multiplicação\n Divisão\n Potenciação\n Raiz");
            operation = scanner.next();

            if (!operation.equalsIgnoreCase("q")) {
                System.out.print("\n Digite o primeiro número: ");
                double numeroUm = scanner.nextDouble();

                System.out.print("\n Digite o segundo número: ");
                double numeroDois = scanner.nextDouble();

                calculadora.realizarOperacao(operation, numeroUm, numeroDois);
            }
        } while (!operation.equalsIgnoreCase("q"));

        System.out.println("\n Você saiu do programa!");
        scanner.close();
    }
}
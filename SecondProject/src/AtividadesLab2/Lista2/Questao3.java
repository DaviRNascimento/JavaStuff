package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
            usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
            mensagem de erro. (utilize a estrutura ESCOLHA)
        */

        int primeiroValor, segundoValor;
        char operacao;

            System.out.println("Digite dois valores inteiros para efetuarmos: ");
            primeiroValor = scanner.nextInt();
            scanner.nextLine();
            segundoValor = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Qual operação deseja realizar?\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nOpção: ");
        operacao = scanner.next().charAt(0);
        scanner.nextLine();

        switch(operacao) {
            case '1':
                System.out.printf("Valor da Soma: %d\n\n", (primeiroValor + segundoValor));
                break;
            case '2':
                System.out.printf("Valor da Subtração: %d\n\n", (primeiroValor - segundoValor));
                break;
            case '3':
                System.out.printf("Valor da Multiplicação: %d\n\n", (primeiroValor * segundoValor));
                break;
            case '4':
                if (segundoValor == 0) {
                    System.out.println("Divisão Indeterminada. Não se pode dividir por 0");
                }
                else {
                    System.out.printf("Valor da divisão: %d", (primeiroValor / segundoValor));
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
        }
        scanner.close();
    }
}

package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 9) Programa que le a porcentagem de IPI(Imposto Sobre Produtos Industrializados) e retorna valores
        System.out.print("""
                Questão de número 9) Recebe IPI e retorna o valor total de um Produto
                Digite  a porcentagem do IPI a ser acrescido nas peças: """);
        
        int codigo1, quantidade1, codigo2, quantidade2;
        float valorUni1, valorUni2;

        // Variavel que recebe a porcentagem de IPI        
        float porcentagemIPI = scanner.nextFloat();
        scanner.nextLine();

        // PEÇA 1
        System.out.print("Codigo da peça 1: ");
        codigo1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Quantidade de peças número 1: ");
        quantidade1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Valor Unitário da peça 1: ");
        valorUni1 = scanner.nextFloat();
        scanner.nextLine();

        // PEÇA 2
        System.out.print("Codigo da peça 2: ");
        codigo2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Quantidade de peças número 2: ");
        quantidade2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Valor Unitário da peça 2: ");
        valorUni2 = scanner.nextFloat();
        scanner.nextLine();

        // RETORNANDO O VALOR TOTAL
        System.out.printf("Valor Total a ser pago: %f \n\n", (valorUni1 * quantidade1 + valorUni2 * quantidade2) / (porcentagemIPI/100 + 1));
    }
}

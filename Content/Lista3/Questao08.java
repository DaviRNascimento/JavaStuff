package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        /*
        Dados dois números inteiros A e B, construa um algoritmo para calcular a soma de
        todos os inteiros existentes entre A e B.
        */

        Scanner scanner = new Scanner(System.in);

        // inicializando variaveis
        int a, b;
        int somaFor = 0;
        int somaWhile = 0;
        int somaDoWhile = 0;

        // pedindo os valores como input
        System.out.println("Digite dois números inteiros A e B: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // usando loop for para calcular
        for(int i = (a + 1); i < b; i++) {
            somaFor = somaFor + i;
        }

        // usando loop while para calcular
        int j = a + 1;
        while(j < b) {
            somaWhile = somaWhile + j;
            j++;
        }

        // usando loop doWhile para calcular
        int w = (a + 1);
        do {
            somaDoWhile = somaDoWhile + w;
            w++;
        }
        while(w < b);
        
        // retornando os valores
        System.out.println("Valor da soma, usando For " + somaFor);
        System.out.println("Valor da soma, usando While: " + somaWhile);
        System.out.println("Valor da soma, usando DoWhile: " + somaDoWhile);

        // fechando objeto da classe Scanner
        scanner.close();
    }
}

package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        // 1) leitura de Valores e Média Ponderada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 valores Inteiros:");

        // Definição de variáveis
        int valor1, valor2, valor3;
        
        System.out.print("Primeiro: ");
        valor1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Segundo: ");
        valor2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Terceiro: ");
        valor3 = scanner.nextInt();
        scanner.nextLine();

        // Impressão dos valores e da Média Ponderada deles
        System.out.printf("Valores digitados: %d, %d, %d.\n", valor1, valor2, valor3);
        System.out.println("Média Ponderada dos valores: " + ((valor1*2) + (valor2*3) + (valor3*5)) / (2+3+5) + "\n");
    }
}

package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
        (denominador igual a zero). Em caso afirmativo, imprima seguinte mensagem: “Divisão indeterminada”, do contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo
        */
        
        int valor1, valor2;

        System.out.print("Digite dois numeros inteiros\nPrimeiro: ");
        valor1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Segundo: ");
        valor2 = scanner.nextInt();
        scanner.nextLine();

        if (valor2 == 0) {
            System.out.println("Divisão indeterminada");
        }
        else {
            float valorDivisao = ((float)valor1 / valor2);
            System.out.printf("Valor da divisão: %.2f\n\n", valorDivisao );
        }
        scanner.close();
    }
}

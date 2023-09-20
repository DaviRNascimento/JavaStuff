package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
        correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”.
        */

        String stringInput;
        int parOuImpar;
        System.out.print("Digite um número inteiro e diremos se é par ou impar: ");
        stringInput = scanner.nextLine();
        parOuImpar = Integer.parseInt(stringInput);

        if (parOuImpar == 0) {
            System.out.printf("O número é %d", parOuImpar);
        }
        else if (parOuImpar % 2 == 0 ) {
            System.out.printf("O número %d é par\n", parOuImpar);
        }
        else {
            System.out.printf("O número %d é ímpar\n", parOuImpar);
        }
        scanner.close();
    }
}

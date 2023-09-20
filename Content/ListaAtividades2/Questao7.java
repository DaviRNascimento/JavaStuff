package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;


public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido.
        Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o programa deverá escrever
        "Financiamento Concedido"; senão, escreverá "Financiamento Negado". Independente de conceder ou não o
        financiamento, o programa escreverá depois a frase "Obrigado por nos consultar."
        */

        float remuneracao, financiamentoPretendido;

        System.out.print("Quanto voce recebe atualmente: ");
        remuneracao = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Valor do financiamento pretendido: ");
        financiamentoPretendido = scanner.nextFloat();
        scanner.nextLine();

        if (financiamentoPretendido <= (remuneracao * 5)) {
            System.out.print("Financiamento Concedido");
        }
        else {
            System.out.println("Financiamento Negado");
        }

        System.out.println("Obrigado por nos consultar!");
        scanner.close();
    }
    
}

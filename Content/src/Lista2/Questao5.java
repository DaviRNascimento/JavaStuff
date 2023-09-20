package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;


public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
        Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
        médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
        crédito. 
        */

        float saldoMedio;

        System.out.print("Saldo médio do último ano: ");
        saldoMedio = scanner.nextFloat();

        if (saldoMedio > 200) {
            if (saldoMedio > 400) {
                    System.out.printf("Seu saldo médio: %.2f e o valor do crédito: %.2f", saldoMedio, (float)(saldoMedio * (20/100.0)));
            }
            else {
                System.out.printf("Seu saldo médio: %.2f e o valor do crédito: %.2f", saldoMedio, (float)(saldoMedio * (10/100.0)));
            }
        }
        else {
                System.out.printf("Seu saldo médio: %.2f e o valor do crédito: 0\n\n", saldoMedio, 0);
        }
        scanner.close();
    }
}

package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        /*
        Escrever um algoritmo que lê um valor n e outro valor m, e calcula a tabuada de n de
        1 até m
        */

        Scanner scan = new Scanner(System.in);

        // definindo variáveis
        int n = 1, m = 1;

        try {
            // recebendo variaveis como input
            System.out.println("Valor de n: ");
            n = scan.nextInt();
            System.out.println("Valor de m: ");
            m = scan.nextInt();

            // loop para calculo da tabuada
            int contador = 1;
            while(contador <= m) {
                System.out.printf("%d X %d = %d\n", contador, n, (contador*n));
                contador++;
            }
        }
        catch(Exception e) {
            System.out.println("Valor inválido. Tente novamente");
        }
        scan.close();
    }
}

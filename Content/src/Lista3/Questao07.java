package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a n, onde
        n é um número fornecido pelo usuário do programa. A verificação se o número é ímpar
        será feita dentro do loop. Caso o número seja ímpar, mostre-o, não sendo, passe para
        o próximo número.
        */

        int n;
        System.out.print("Digite um número n: ");
        n = scanner.nextInt();

        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

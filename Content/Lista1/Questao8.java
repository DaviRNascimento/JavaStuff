package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //8) Programa que recebe um número e retorna o antecessore o sucessor
        System.out.print("""
                Questao de número 8) Recebe um número inteiro e calcula antecessor e sucessor
                Digite um número qualquer(inteiro): """);

        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("""
                Valor digitado: %d
                Antecessor: %d
                Sucessor: %d\n\n""", num, Math.decrementExact(num), Math.incrementExact(num));
    }   
}

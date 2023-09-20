package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6) Leitura de um número e operações encima do mesmo
        System.out.print("""
                Questão de Número 6) Leitura de um Número e operações sobre do mesmo
                Digite um Número qualquer: """);

        // variavel que armazena o número
        float numeroRecebido = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.printf("""
                O número dado é: %.2f
                O triplo desse número equivale a: %.0f
                A metade dele é: %.2f
                Sua raiz cúbic, arredondada: %.0f
                E, por fim, este mesmo número elevado a 2/3: %.2f\n\n""", numeroRecebido, 
                (numeroRecebido*3), 
                (numeroRecebido/2), 
                Math.cbrt(numeroRecebido),
                (Math.pow(numeroRecebido, 2/3 )));
    }
}

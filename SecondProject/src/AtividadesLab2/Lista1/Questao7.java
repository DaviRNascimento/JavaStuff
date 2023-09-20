package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // 7) Programa que calcula distancia em quaisqueres dois pontos
        int x1, x2, y1, y2;
        
        System.out.print("""
                Questão de Número 7) Calculo da distancia de dois pontos no plano cartesiano
                De os valores de entrada do primeiro ponto P(x1, y1)
                x1: """);
        
        // Recebendo primeira variavel do ponto 1
        x1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("x2: ");

        // Recebendo segunda variavel do ponto 1
        x2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agora as variaveis do Segundo Ponto, y1:");

        // Recebendo Primeira variável do Segundo Ponto
        y1 = scanner.nextInt();
        scanner.nextLine();

        // Recebendo Segunda variável do Segundo Ponto
        y2 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("""
            Esses sao os pontos dados:
            Primeiro ponto, x1: %d, x2: %d
            Segundo Ponto, y1: %d, y2: %d
            Distancia entre eles no plano: %.2f\n\n""", x1, x2, y1, y2, Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }
}

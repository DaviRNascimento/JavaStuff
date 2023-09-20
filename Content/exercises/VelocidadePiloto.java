import java.util.Scanner;

public class VelocidadePiloto {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // Declaração de variaveis
        float distancia, tempo;
        String nome;

        // recebendo os valores por input
        System.out.print("Nome do Piloto: ");
        nome = scanner.nextLine();
        System.out.print("Distancia percorrida por ele(em km): ");
        distancia = scanner.nextFloat();
        System.out.println("Em quanto tempo o piloto percorreu(em horas): ");
        tempo = scanner.nextFloat();

        // variavel que armazena a velocidade media do piloto
        float velocidadeMedia = (distancia /  tempo);

        System.out.printf("A velocidade media de %s foi de %.2f", nome, velocidadeMedia);

        // fechando objeto da classe Scanner
        scanner.close();
    }   
}
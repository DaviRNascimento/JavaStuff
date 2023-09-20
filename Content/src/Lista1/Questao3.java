package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3)Piloto
        System.out.println("""
            Questao de Número 3) Informações do Piloto
            Digite abaixo as informações do piloto necessárias:""");

        // Entrada de Dados
        System.out.print("Nome: ");
        String nomePiloto = scanner.nextLine();
        System.out.print("Distância em KM: ");
        float distanciaPiloto = scanner.nextFloat();
        System.out.print("Tempo para percorrer em horas: ");
        float tempoPiloto = scanner.nextFloat();
        float velocidadeMedia = (float) (distanciaPiloto / tempoPiloto);

        // Dados do Piloto
        System.out.printf("Nome do Piloto: %s,\nDistancia percorrida: %.2f Km,\nTempo para percorrer: %.2f horas\n", nomePiloto, distanciaPiloto, tempoPiloto);

        // Velocidade Média        
        System.out.printf("A velocidade média de %s foi %.2fkm/h \n\n", nomePiloto, velocidadeMedia);

    }
}

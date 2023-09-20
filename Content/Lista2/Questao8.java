package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;


public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Dois carros percorreram diferentes distâncias em diferentes tempos. Sabendo que a velocidade média é a
        razão entre a distância percorrida e o tempo levado para percorrê-la, faça um programa para ler as distâncias
        que cada carro percorreu e o tempo que cada um levou, e indique o carro que teve maior velocidade média.
        */

        String distancia1, distancia2, tempo1, tempo2;
        float velocidadeM1, velocidadeM2;

        System.out.print("Distância percorrida pelo primeiro(KM): ");
        distancia1 = scanner.nextLine();
        System.out.print("Tempo levado(H): ");
        tempo1 = scanner.nextLine();

        System.out.print("Distancia percorrida pelo segundo(KM): ");
        distancia2 = scanner.nextLine();
        System.out.print("Tempo levado(H): ");
        tempo2 = scanner.nextLine();

        velocidadeM1 = ((Float.parseFloat(distancia1) / (Float.parseFloat(tempo1))));
        velocidadeM2 = ((Float.parseFloat(distancia2) / (Float.parseFloat(tempo2))));

        if(Float.compare(velocidadeM1, velocidadeM2) == 1) {
            System.out.println("O carro de número 1 teve maior velocidade");
        }
        else if(Float.compare(velocidadeM1, velocidadeM2) == 0) {
            System.out.println("Os dois carros tiveram velocidades iguais");
        }
        else {
            System.out.println("O carro de número 2 teve maior velocidade");
        }
        scanner.close();
    }
}

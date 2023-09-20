package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;


public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Criar um algoritmo que leia o código da carga e o peso (em toneladas) da carga de um caminhão. Caso o
        código não esteja entre os intervalos descritos na tabela, imprimir mensagem: “código inválido”. Calcule e
        imprima: o peso da carga do caminhão convertido em quilos (1 ton – 1000kg) e o preço da carga do
        caminhão, de acordo com a tabela abaixo
        */

        byte codigoCarga;
        float pesoTon;

        System.out.println("Digite o código da carga: ");
        codigoCarga = scanner.nextByte();
        scanner.nextLine();

        if(codigoCarga > 10) {
            if (codigoCarga > 20) {
                if(codigoCarga > 30 && codigoCarga <= 40){
                    System.out.println("Toneladas da carga de um caminhão: ");
                    pesoTon = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 330));
                }
                else if(codigoCarga > 40) {
                    System.out.println("Código inválido");
                }
                else {
                    System.out.println("Toneladas da carga de um caminhão: ");
                    pesoTon = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 250));
                }
            }
            else {
                System.out.println("Toneladas da carga de um caminhão: ");
                pesoTon = scanner.nextFloat();
                scanner.nextLine();
                System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 100));
            }
        }
        else {
            System.out.println("Código Inválido");
        }
        scanner.close();
    }
}

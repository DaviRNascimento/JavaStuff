package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao14 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Uma empresa de energia elétrica trabalha com 3 tipos de consumidores: I – Industrial; C – Comercial; R –
        Residencial. Fazer um algoritmo para ler o tipo de consumidor („I‟, „C‟ ou „R‟), a quantidade de energia 
        consumida, e calcular e imprimir qual será o valor pago. Para calcular o valor pago, verificar a tabela abaixo. 
        */
        char consumidor;
        String quantEnergiaCons;
        float energiaConsumida;

        System.out.print("Qual o tipo de consumidor?\n('I' - Industrial)\n('R' - Residencial)\n('C' - Comercial)\n: ");
        consumidor = scanner.next().charAt(0);
        scanner.nextLine();

        switch(consumidor) {
            case 'I':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.68) + 34);
                break;

            case 'C':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.37) + 45);
                break;

            case 'R':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.77) - 22);
                break;

            default:
                System.out.println("Valor inválido. Tente novamente");
                break;
        }
        scanner.close();
    }
}

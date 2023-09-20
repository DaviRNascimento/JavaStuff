package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        A loja Constrói em Partes produz dois tipos de hastes: cobre e alumínio. Cada haste de cobre é vendida por 
        R$ 2,00, e cada haste de alumínio é vendida por R$ 4,00. O desconto dado dependerá da quantidade de 
        hastes compradas, conforme tabela abaixo. Fazer um algoritmo para ler a quantidade comprada de cada tipo 
        de haste e imprima o total pago.
        */   

        char haste;
        String quant;
        int quantidade;

        System.out.print("Comprou hastes de cobre ou de alumínio? Digite 'C' para cobre e 'A' para alumínio: ");
        haste = scanner.next().charAt(0);
        scanner.nextLine();

        switch(haste) {
            case 'C':
                System.out.print("Qual a quantidade de hastes compradas: ");
                quant = scanner.nextLine();
                quantidade = Integer.parseInt(quant);
                if(quantidade < 5 ) {
                    System.out.printf("Valor pago: %d", quantidade * 2);
                }
                else if(quantidade >= 5) {
                    if (quantidade <= 15) {
                        System.out.printf("Valor pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 10/100.0)) );
                    }
                    else if(quantidade <= 20) {
                        System.out.printf("Valor pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 15/100.0)) );
                    }
                    else {
                        System.out.printf("Valor pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 20/100.0)) );
                    }
                }
                break;
            case 'A':
                System.out.print("Qual a quantidade de hastes compradas: ");
                quant = scanner.nextLine();
                quantidade = Integer.parseInt(quant);

                if(quantidade < 5 ) {
                    System.out.printf("Valor pago: %d", quantidade * 4);
                }
                else if(quantidade >= 5) {
                    if (quantidade <= 15) {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 10/100.0)) );
                    }
                    else if(quantidade <= 20) {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 15/100.0)) );
                    }
                    else {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 20/100.0)) );
                    }
                }
                break;
            default:
                System.out.println("Valor inválido. Tente novamente");
                break;
        }
        scanner.close();
    }
}

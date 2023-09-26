import java.util.Scanner;

public class PotenciaManual {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Código de calculo de potencia");

        while(true) {
            System.out.print("Digite 1 para continuar para os valores e 0 para sair: ");
            
            float valor1, valor2;
            char option;

            option = scanner.next().charAt(0);
            scanner.nextLine();

            if (option == '0') {
                System.out.println("Valeu meu nobre");
                break;
            }
            else {
                try {
                    System.out.print("Valor1: ");
                    valor1 = scanner.nextFloat();
                        
                    System.out.print("Valor2: ");
                    valor2 = scanner.nextFloat();

                    System.out.printf("Resultado: %.2f\n", sum(valor1, valor2));
                }
                catch(Exception e) {
                    System.out.println("Valor inválido. Tente novamente");
                }
            }
        }
        scanner.close();
    }

    public static float sum(float a, float b) {
        float soma = a;

        if (b < 0) {
            float divisor = ((b * 2) * -1);
            return (1 / divisor);
        }
        else {
            for(int i = 1; i <= (b - 1); i++) {
               soma = soma * a;
            }
            return soma;
           }   
        }
}

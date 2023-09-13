import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // creating the Scanner class object
        Scanner scanner = new Scanner(System.in);

        // declaring variables
        char opcao = ' ';
        double valor1, valor2;

        while(opcao != 's') {
            System.out.print("Digite o tipo de operação: ( + - * /)\nDigite 's' para sair\nOpção: ");
            opcao = scanner.next().charAt(0);

            switch(opcao) {
                case '+':
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = scanner.nextFloat();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = scanner.nextFloat();
                    System.out.printf("Resultado: %.2f\n", (valor1 + valor2));
                    break;
                    
                case '-':
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = scanner.nextFloat();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = scanner.nextFloat();
                    System.out.printf("Resultado: %.2f\n", (valor1 - valor2));
                    break;

                case '*':
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = scanner.nextFloat();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = scanner.nextFloat();
                    System.out.printf("Resultado: %.2f\n", (valor1 * valor2));
                    break;

                case '/':
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = scanner.nextFloat();
                    System.out.print("Digite o segundo valor: ");
                    valor2 = scanner.nextFloat();

                        // cant divide by 0
                        if(valor2 == 0) {
                            System.out.println("Invalido");
                            break;
                        }
                        else {
                            System.out.printf("Resultado: %.2f\n", (valor1 / valor2));
                            break;

                        }
                case 's':
                        break;

                default:
                        System.out.print("Saindo");
                        break;
                }

        }
    }
}   
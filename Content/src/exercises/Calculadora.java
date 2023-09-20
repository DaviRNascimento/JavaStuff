import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição de variaveis
        char op;
        float valor1, valor2;

        // Recebendo os valores
        System.out.println("Quais valores deseja calcular? Primeiro valor: ");
        valor1 = scanner.nextFloat();
        System.out.println("Segundo valor: ");
        valor2 = scanner.nextFloat();

        // Fazendo escolha d aoperação
        System.out.println("Qual tipo de operação deseja realizar: x para multiplicacao\n / -> divisao\n + -> soma \n - -> subtracao");
        op = scanner.next().charAt(0);

        // Identificação de tipo de operação
        switch(op) {
            case 'x':
            System.out.printf("Valor da Operação: %.2f" , (valor1 * valor2));
            break;

            case'/':
            System.out.printf("Valor da Operação: %.2f", (valor1 / valor2));
            break;

            case '+':
            System.out.printf("Valor da operação: %.2f", (valor1 + valor2));
            break;

            case'-':
            System.out.printf("Valor da Operação: %.2f", (valor1 - valor2));
            break;

            default:
            System.out.println("Operação invalida");
            break;
        }

        // Fechando objeto da classe Scanner
        scanner.close();
    }
}

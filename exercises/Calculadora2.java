import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // definição de variaveis
        char op;
        float valor1, valor2;

        System.out.print("Digite os dois valores que deseja calcular: \nvalor 1:");
        valor1 = scanner.nextFloat();
        System.out.print("valor 2: ");
        valor2 = scanner.nextFloat();
        System.out.print("Qual o tipo de operação: \n use + para soma\n- para subtração\nx para multiplicação\n/ para divisão\n:");
        op = scanner.next().charAt(0);

        // Chamando o metodo para calcular:
        Calculando(op, valor1, valor2);

        // Fechando Objeto
        scanner.close();
    }

    public static void Calculando(char op, float valor1, float valor2) {
        switch(op) {
            case 'x':
            System.out.printf("Valor da operação: %.2f", (valor1 * valor2));
            break;

            case '/':
            System.out.printf("Valor da Operação: %.2f", (valor1 / valor2));
            break;

            case'+':
            System.out.printf("Valor da Operção: %.2f", (valor1 + valor2));
            break;

            case'-':
            System.out.printf("Valor da Operação: %.2f", (valor1 - valor2));

            default:
            System.out.print("Opção Inválida. Tente novamente");
        }
    }
}
import java.util.Scanner;

public class Calculadora3 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // definição de variaveis
        char op;
        float valor1, valor2;

        System.out.println("Escolha o tipo de operação: \n 1 - SOMA \n 2 - SUBTRAÇÃO \n 3 - MULTIPLICAÇÃO \n 4 - DIVISAO \n :");
        op = scanner.next().charAt(0);

        if (op == 1){
            System.out.print("Primeiro valor: ");
            valor1 = scanner.nextFloat();

            System.out.print("Segundo valor: ");
            valor2 = scanner.nextFloat();

            Somando(valor1, valor2);
        }
        else if( op == 2){
            System.out.print("Primeiro valor: ");
            valor1 = scanner.nextFloat();

            System.out.print("Segundo valor: ");
            valor2 = scanner.nextFloat();

            Subtraindo(valor1, valor2);
        }
        else if( op == 3) {
            System.out.print("Primeiro valor: ");
            valor1 = scanner.nextFloat();

            System.out.print("Segundo valor: ");
            valor2 = scanner.nextFloat();

            Multiplicando(valor1, valor2);
        }
        else if( op == 4) {
            System.out.print("Primeiro valor: ");
            valor1 = scanner.nextFloat();

            System.out.print("Segundo valor: ");
            if(scanner.nextFloat() == 0) {
                System.out.print("Valor inválido");
                
            }

        }
        scanner.close();
    }




    public static float Somando(float a, float b) {
        return (a + b);
    }

    public static float Subtraindo(float a, float b) {
        return (a - b);
    }

    public static float Multiplicando(float a, float b) {
        return (a * b);
    }

    public static float Dividindo(float a, float b) {
        if( b == 0) {
            System.out.println("Não se pode dividir por 0");
        }

        return (a / b);
    }
}

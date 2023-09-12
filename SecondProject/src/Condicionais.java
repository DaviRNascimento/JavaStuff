import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Question Number 1)
         * Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
         * (denominador igual a zero). Em caso afirmativo, imprima a seguinte mensagem: “Divisão indeterminada”, 
         * do contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo.
        */

        double dividendo, divisor;
        try {
            // Checking first value
            System.out.print("dividendo: ");
            dividendo = scanner.nextInt();
            scanner.nextLine();

            // Checking second value
            System.out.print("divisor: ");
            divisor = scanner.nextInt();
            scanner.nextLine();
            if (divisor == 0) {
                System.out.print("Divisão Indeterminada!");
            }
            else {
                System.out.printf("Resultado da divisão\nExatamente: %.3f\nArredondado: %.0f\n\n", dividendo/divisor, dividendo / divisor);
            }
        }
        catch (Exception e) {
            System.out.println("Divisão Indeterminada!");
        }

        /*
         * Question Number 2)
         * Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
         * correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”.
        */

        int number;
        System.out.print("Digite um número inteiro qualquer: ");
        number = scanner.nextInt();
        scanner.nextLine();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par\n\n", number);
        }
        else if (number == 0) {
            System.out.print("O valor é zero\n\n");
        }
        else {
            System.out.printf("O número %d é ímpar\n\n", number);
        }
        
        /*
         * Questio Number 3) -> Calculadora
         * Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
         * usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
         * mensagem de erro. (utilize a estrutura ESCOLHA)
         */

        double primeiroOperando, segundoOperando;
        char operador;

        try {
            System.out.print("Digite o primeiro valor para calcularmos: ");
            primeiroOperando = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite o segundo valor: ");
            segundoOperando = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Escolha uma das opções de cálculo: (+ - * /)\nDigite somente o operador: ");
            operador = scanner.nextLine().charAt(0);

        switch(operador) {
            case '+':
                System.out.print(primeiroOperando + segundoOperando);
                break;
            case '-':
                System.out.print(primeiroOperando - segundoOperando);
                break;
            case '*':
                System.out.print(primeiroOperando * segundoOperando);
                break;
            case '/':
                if (segundoOperando == 0) {
                    System.out.println("Inválido");
                }
                else {
                    System.out.print(primeiroOperando / segundoOperando);
                }
                break;
            default:
                System.out.print("Algo deu errado. Tente novamente!\n");
            }
        }
        catch(Exception e) {
            System.out.println("Algo de errado não está certo\n");
        }

        /*
         * Questio number 4)
         * Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
         * conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
         * novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
         * salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA)
        */

        int cargo;
        float salario, salarioComAumento;

        try{
            System.out.print("\nQual o código do seu cargo: ");
            cargo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Seu salário: ");
            salario = scanner.nextFloat();
            scanner.nextLine();
            
            switch(cargo) {
                case 101:
                    salarioComAumento = (salario) + (salario * (0.1f)); 
                    System.out.printf("Seu salário atual: %.2f\nCom aumento: %.2f\nDiferen;a: %.2f", salario, salarioComAumento, (salarioComAumento - salario));
                    break;
                case 102:
                    salarioComAumento = (salario) + (salario * (0.2f)); 
                    System.out.printf("Seu salário atual: %.2f\nCom aumento: %.2f\nDiferen;a: %.2f", salario, salarioComAumento, (salarioComAumento - salario));
                    break;
                case 103:
                    salarioComAumento = (salario) + (salario * (0.3f)); 
                    System.out.printf("Seu salário atual: %.2f\nCom aumento: %.2f\nDiferen;a: %.2f", salario, salarioComAumento, (salarioComAumento - salario));
                    break;
                default:
                    salarioComAumento = (salario) + (salario * (0.05f)); 
                    System.out.printf("Seu salário atual: %.2f\nCom aumento: %.2f\nDiferen;a: %.2f", salario, salarioComAumento, (salarioComAumento - salario));
                    break;
            }
        }
        catch(Exception e) {
            System.out.print("Algo deu errado. Tente novamente\n");
        }

    scanner.close();

    }
}

package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
            conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
            novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
            salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA)
        */

        String codigo, salario;
        float salarioAtual, diferença;

        System.out.print("Digite seu código: ");
        codigo = scanner.nextLine();
        System.out.print("Digite seu salário: ");
        salario = scanner.nextLine();

        switch(codigo) {
            case "101":
                salarioAtual = Float.parseFloat(salario);
                diferença = (float) (salarioAtual * (10/100.0));

                System.out.printf("Seu salário atual: %.2f; Valor de reajuste: %.2f; Valor final: %.2f\n", salarioAtual, diferença, salarioAtual + diferença);
                break;

            case "102":
                salarioAtual = Float.parseFloat(salario);
                diferença = (float) (salarioAtual * (20/100.0));

                System.out.printf("Seu salário atual: %.2f; Valor de reajuste: %.2f; Valor final: %.2f\n", salarioAtual, diferença, salarioAtual + diferença);
                break;

            case "103":
                salarioAtual = Float.parseFloat(salario);
                diferença = (float) (salarioAtual * (30/100.0));

                System.out.printf("Seu salário atual: %.2f; Valor de reajuste: %.2f; Valor final: %.2f\n", salarioAtual, diferença, salarioAtual + diferença);
                break;

            default:
                salarioAtual = Float.parseFloat(salario);
                diferença = (float) (salarioAtual * (5/100.0));

                System.out.printf("Seu salário atual: %.2f; Valor de reajuste: %.2f; Valor final: %.2f\n", salarioAtual, diferença, salarioAtual + diferença);
                break;
        }
        scanner.close();
    }
}

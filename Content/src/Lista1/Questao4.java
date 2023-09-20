package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4) Pizzaria
        System.out.print("""
            Questão de número 4) Pizzaria
            Qual foi a quantidade de Tulipas de Chope pedidas? """);

        // Declaração das Constantes, pois no decorrer do código esses valores não vão mudar
        final float VALOR_TULIPA = 1.80f;
        final float VALOR_PIZZA = 25.00f;
        final float VALOR_COBERTURA = 3.50f;

        int quantidadeTulipas, quantidadePizzas, quantidadeCoberturas, quantidadePessoas;
        quantidadeTulipas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantidade de Pizzas: ");
        quantidadePizzas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantidade de coberturas: ");
        quantidadeCoberturas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantidade de Pessoas: ");
        quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        // Valor Total
        float valorTotal = ((quantidadePizzas * VALOR_PIZZA) + (quantidadeTulipas * VALOR_TULIPA) + (quantidadeCoberturas * VALOR_COBERTURA));

        // Porcentagem do Garçom
        float valorGarcom = (float) (valorTotal / 100);
        
        // Impressão de Dados
        System.out.printf("Valor Total: R$%.2f, Valor Garçom: R$%.2f, Valor Para cada um dividido igualmente: R$%.2f\n\n", valorTotal, valorGarcom, (valorTotal/quantidadePessoas));
    }
}

package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        /*
        Escrever um algoritmo que leia um conjunto de valores e calcule a média aritmética dos
        valores lidos, a quantidade de valores positivos e o percentual de valores negativos
        Mostre os resultados no final. Para terminar o programa, o usuário deverá
        digitar o valor zero. O valor zero não entra nos cálculos.
        */
        Scanner scan = new Scanner(System.in);
        
        // definição de variaveis
        float
        quantidadeTotal = 0f,
        quantidadePositivos = 0f,
        quantidadeNegativos = 0f,
        positivos = 0,
        negativos = 0,
        numero = 1f,
        total,
        porcentagemNegativos;

        System.out.println("Digite variados números e vamos retornar alguns dados sobre eles");
        while(numero != 0) {
            System.out.print("Número: ");
            numero = scan.nextFloat();

            // Quando 0 é digitado, ele nao entra na variavel 'quantidade'
            if (numero == 0) {
               break; 
            }
            else{
                quantidadeTotal++;

                if (numero < 0) {
                    negativos = negativos + numero;
                    quantidadeNegativos++;
                }
                else if (numero > 0) {
                    positivos = positivos + numero;
                    quantidadePositivos++;
                }
            }
        }
        total = positivos + negativos;
        porcentagemNegativos = (quantidadeNegativos * 100) / quantidadeTotal;

        System.out.printf("Quantidade total de valores digitados: %.0f\n", quantidadeTotal);

        System.out.printf("Soma valores positivos: %.2f\n", positivos);
        System.out.printf("Quantidade de valores positivos: %.0f\n", quantidadePositivos);

        System.out.printf("Soma valores negativos: %.2f\n", negativos);
        System.out.printf("Quantidade de valores negativos: %.0f\n", quantidadeNegativos);

        System.out.printf("Soma positivos com negativos: %.2f\n", total);
        System.out.printf("Média aritmética de tudo: %.0f\n", (total/quantidadeTotal));

        System.out.printf("Porcentagem de valores negativos: %.2f%%\n", porcentagemNegativos);

        // fechando objeto da classe Scanner;
        scan.close();
    }
}

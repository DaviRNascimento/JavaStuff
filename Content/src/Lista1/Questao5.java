package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5) Conversão de Farenheit para Celsius
        System.out.println("""
                Questão de Número 5) Conversão de Temperaturas
                Informe de qual temperatura gostaria de converter:
                1) Celsius
                2) Fahrenheit
                ***Digite apenas o número da opção***
                """);

        // recebe a opção
        char opcao = scanner.next().charAt(0);
        scanner.nextLine();

        if (opcao == '1') {
            // Recebendo o valor da temp. base para converter
            System.out.print("Qual a temperatura em Celsius: ");
            float tempCelsius = scanner.nextFloat();
            scanner.nextLine();

            // Imprimindo o valor Convertido
            System.out.printf("Convertido para Fahrenheit temos: %.2f Fahrenheit\n\n", ((tempCelsius * (9/5.00) + 32)));

        } else if (opcao == '2') {
            // Recebendo o valor da temp. base para converter
            System.out.print("Qual a temperatura em Fahrenheit: ");
            float tempFahrenheit = scanner.nextFloat();
            scanner.nextLine();

            System.out.printf("Convertido para Celsius temos: %.2f graus Celsius\n\n", ((tempFahrenheit - 32) * (5/9.00)));
        }
        

    }
}

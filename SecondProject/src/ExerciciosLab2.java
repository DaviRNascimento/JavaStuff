import java.util.Scanner;

public class ExerciciosLab2 {
    public static void main(String[] args) {

        // Lista de Atividades LP2
        // 1) leitura de Valores e Média Ponderada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 valores Inteiros:");

        // Definição de variáveis
        int valor1, valor2, valor3;
        
        System.out.print("Primeiro: ");
        valor1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Segundo: ");
        valor2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Terceiro: ");
        valor3 = scanner.nextInt();
        scanner.nextLine();

        // Impressão dos valores e da Média Ponderada deles
        System.out.printf("Valores digitados: %d, %d, %d.\n", valor1, valor2, valor3);
        System.out.println("Média Ponderada dos valores: " + ((valor1*2) + (valor2*3) + (valor3*5)) / (2+3+5));


        // 2) Quilometragem por Litro de Gasolina
        System.out.println("""
            Questao de Número 2) Quilometragem por Litro de Gasolina
            Quantos litros de gasolina foram necessários durante a viagem? """);

        //
        float litrosGasolina = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("E qual foi a quilometragem total? ");
        float quilometros = scanner.nextFloat();
        scanner.nextLine();

        // variável que armazena a quilometragem por litro
        String quilometragem = Float.toString((quilometros / litrosGasolina));
        quilometragem.replace(",", ".");

        System.out.printf("Voce fez %skm, em média, por litro de gasolina.\n ", quilometragem);



        // 3)Piloto
        System.out.println("""
            Questao de Número 3) Informações do Piloto
            Digite abaixo as informações do piloto necessárias:
            """);

        // Entrada de Dados
        System.out.print("Nome: ");
        String nomePiloto = scanner.nextLine();
        System.out.print("Distância em KM: ");
        float distanciaPiloto = scanner.nextFloat();
        System.out.print("Tempo para percorrer em horas: ");
        float tempoPiloto = scanner.nextFloat();
        float velocidadeMedia = (float) (distanciaPiloto / tempoPiloto);

        // Dados do Piloto
        System.out.printf("Nome do Piloto: %s,\nDistancia percorrida: %.2f Km,\nTempo para percorrer: %.2f horas\n", nomePiloto, distanciaPiloto, tempoPiloto);

        // Velocidade Média        
        System.out.printf("A velocidade média de %s foi %.2fkm/h \n\n", nomePiloto, velocidadeMedia);


        // 4) Pizzaria
        System.out.println("""
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
        System.out.printf("""
            Valor Total: R$%.2f
            Valor Garçom: R$%.2f
            Valor Para cada um dividido igualmente: R$%.2f\n\n
        """, valorTotal, valorGarcom, (valorTotal/quantidadePessoas));


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
            System.out.println("Qual a temperatura em Celsius: ");
            float tempCelsius = scanner.nextFloat();
            scanner.nextLine();

            // Imprimindo o valor Convertido
            System.out.printf("Convertido para Fahrenheit temos: %.2f", ((tempCelsius * (9/5.00) + 32)));

        } else if (opcao == '2') {
            // Recebendo o valor da temp. base para converter
            System.out.println("Qual a temperatura em Fahrenheit: ");
            float tempFahrenheit = scanner.nextFloat();
            scanner.nextLine();

            System.out.printf("Convertido para Celsius temos: %.2f", ((tempFahrenheit - 32) * (5/9.00)));
        }
        
        scanner.close();

        /*
        Preciso finalizar
        I still need to finish
        .
        .
        .
        */
            
    }
}
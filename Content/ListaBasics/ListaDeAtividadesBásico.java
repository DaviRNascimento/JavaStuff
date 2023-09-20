import java.util.Scanner;
import java.lang.Math;

public class ListaDeAtividades {
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
        

        // 6) Leitura de um número e operações encima do mesmo
        System.out.println("""
                Questão de Número 6) Leitura de um Número e operações encima do mesmo
                Digite um Número qualquer:
                """);

        // variavel que armazena o número
        float numeroRecebido = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.printf("""
                O número dado é: %.2f
                O triplo desse número equivale a: %.0f
                A metade dele é: %.2f
                Sua raiz cúbica: %.0f
                E, por fim, este mesmo número elevado a 2/3: %.2f
                """, numeroRecebido, 
                (numeroRecebido*3), 
                (numeroRecebido/2), 
                Math.cbrt(numeroRecebido),
                (Math.pow(numeroRecebido, 2/3 )));
            

        // 7) Programa que calcula distancia em quaisqueres dois pontos
        int x1, x2, y1, y2;
        
        System.out.println("""
                Questão de Número 7) Calculo da distancia de dois pontos no plano cartesiano
                De os valores de entrada do primeiro ponto P(x1, y1)
                x1:
                        """);
        
        // Recebendo primeira variavel do ponto 1
        x1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("x2: ");

        // Recebendo segunda variavel do ponto 1
        x2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agora as variaveis do Segundo Ponto, y1:");

        // Recebendo Primeira variável do Segundo Ponto
        y1 = scanner.nextInt();
        scanner.nextLine();

        // Recebendo Segunda variável do Segundo Ponto
        y2 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("""
            Esses sao os pontos dados:
            Primeiro ponto, x1: %d, x2: %d
            Segundo Ponto, y1: %d, y2: %d
            Distancia entre eles no plano: %.2f
                """, x1, x2, y1, y2, Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));

                
        //8) Programa que recebe um número e retorna o antecessore o sucessor
        System.out.print("""
                Questao de número 8) Recebe um número inteiro e calcula antecessor e sucessor
                Digite um número qualquer(inteiro): """);

        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("""
                Valor digitado: %d
                Antecessor: %d
                Sucessor: %d""", num, Math.decrementExact(num), Math.incrementExact(num));
                

        // 9) Programa que le a porcentagem de IPI(Imposto Sobre Produtos Industrializados) e retorna valores
        System.out.println("""
                Questão de número 9) Recebe IPI e retorna o valor total de um Produto
                Digite  a porcentagem do IPI a ser acrescido nas peças: """);
        
        int codigo1, quantidade1, codigo2, quantidade2;
        float valorUni1, valorUni2;

        // Variavel que recebe a porcentagem de IPI        
        float porcentagemIPI = scanner.nextFloat();
        scanner.nextLine();

        // PEÇA 1
        System.out.println("Codigo da peça 1:");
        codigo1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantidade de peças número 1:");
        quantidade1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Valor Unitário da peça 1: ");
        valorUni1 = scanner.nextFloat();
        scanner.nextLine();

        // PEÇA 2
        System.out.println("Codigo da peça 2:");
        codigo2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantidade de peças número 2:");
        quantidade2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Valor Unitário da peça 2: ");
        valorUni2 = scanner.nextFloat();
        scanner.nextLine();

        // RETORNANDO O VALOR TOTAL
        System.out.printf("""
                Valor Total a ser pago: 
                %f """, (valorUni1 * quantidade1 + valorUni2 * quantidade2) / (porcentagemIPI/100 + 1));

                
                
        scanner.close();
    }
}
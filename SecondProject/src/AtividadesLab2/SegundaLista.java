package AtividadesLab2;
import java.util.Scanner;

public class SegundaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
        (denominador igual a zero). Em caso afirmativo, imprima seguinte mensagem: “Divisão indeterminada”, do contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo
        */
        
        int valor1, valor2;

        System.out.println("Digite dois numeros inteiros: ");
        valor1 = scanner.nextInt();
        scanner.nextLine();
        valor2 = scanner.nextInt();
        scanner.nextLine();

        if (valor2 == 0) {
            System.out.println("Divisão indeterminada");
        }
        else {
            System.out.printf("Valor da divisão: %d\n\n", (valor1 / valor2) );
        }

        /*
         * Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
        correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”.
        */

        String stringInput;
        int parOuImpar;
        System.out.print("Digite um número inteiro e diremos se é par ou impar: ");
        stringInput = scanner.nextLine();
        parOuImpar = Integer.parseInt(stringInput);

        if (parOuImpar == 0) {
            System.out.printf("O número é %d", parOuImpar);
        }
        else if (parOuImpar % 2 == 0 ) {
            System.out.printf("O número %d é par\n", parOuImpar);
        }
        else {
            System.out.printf("O número %d é ímpar\n", parOuImpar);
        }

        /*
         * Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
            usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
            mensagem de erro. (utilize a estrutura ESCOLHA)
        */

        int primeiroValor, segundoValor;
        char operacao;

            System.out.println("Digite dois valores inteiros para efetuarmos: ");
            primeiroValor = scanner.nextInt();
            scanner.nextLine();
            segundoValor = scanner.nextInt();
            scanner.nextLine();

        System.out.print("Qual operação deseja realizar?\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nOpção: ");
        operacao = scanner.next().charAt(0);
        scanner.nextLine();

        switch(operacao) {
            case '1':
                System.out.printf("Valor da Soma: %d\n\n", (primeiroValor + segundoValor));
                break;
            case '2':
                System.out.printf("Valor da Subtração: %d\n\n", (primeiroValor - segundoValor));
                break;
            case '3':
                System.out.printf("Valor da Multiplicação: %d\n\n", (primeiroValor * segundoValor));
                break;
            case '4':
                if (segundoValor == 0) {
                    System.out.println("Divisão Indeterminada");
                }
                else {
                    System.out.printf("Valor da divisão: %d", (primeiroValor / segundoValor));
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
        }

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

            /*
            * Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
        Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
        médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
        crédito. 
        */

        float saldoMedio;

        System.out.print("Saldo médio do último ano: ");
        saldoMedio = scanner.nextFloat();

        if (saldoMedio > 200) {
            if (saldoMedio > 400) {
                    System.out.printf("Seu saldo médio: %.2f e o valor do crédito: %.2f", saldoMedio, (float)(saldoMedio * (20/100.0)));
            }
            else {
                System.out.printf("Seu saldo médio: %.2f e o valor do crédito: %.2f", saldoMedio, (float)(saldoMedio * (10/100.0)));
            }
        }
        else {
                System.out.printf("Seu saldo médio: %.2f e o valor do crédito: 0\n\n", saldoMedio, 0);
        }

        /*
            * Criar um algoritmo que leia o código da carga e o peso (em toneladas) da carga de um caminhão. Caso o
        código não esteja entre os intervalos descritos na tabela, imprimir mensagem: “código inválido”. Calcule e
        imprima: o peso da carga do caminhão convertido em quilos (1 ton – 1000kg) e o preço da carga do
        caminhão, de acordo com a tabela abaixo
        */

        byte codigoCarga;
        float pesoTon;

        System.out.println("Digite o código da carga: ");
        codigoCarga = scanner.nextByte();
        scanner.nextLine();

        if(codigoCarga > 10) {
            if (codigoCarga > 20) {
                if(codigoCarga > 30 && codigoCarga <= 40){
                    System.out.println("Toneladas da carga de um caminhão: ");
                    pesoTon = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 330));
                }
                else if(codigoCarga > 40) {
                    System.out.println("Código inválido");
                }
                else {
                    System.out.println("Toneladas da carga de um caminhão: ");
                    pesoTon = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 250));
                }
            }
            else {
                System.out.println("Toneladas da carga de um caminhão: ");
                pesoTon = scanner.nextFloat();
                scanner.nextLine();
                System.out.printf("kg: %.2f, preço da carga: %.2f", (float)(pesoTon * 1000.0), (float)((pesoTon * 1000.0) * 100));
            }
        }
        else {
            System.out.println("Código Inválido");
        }

        /*
         * Faça um programa que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido.
        Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o programa deverá escrever
        "Financiamento Concedido"; senão, escreverá "Financiamento Negado". Independente de conceder ou não o
        financiamento, o programa escreverá depois a frase "Obrigado por nos consultar."
        */

        float remuneracao, financiamentoPretendido;
        System.out.println("Quanto voce recebe atualmente: ");
        remuneracao = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Valor do financiamento pretendido: ");
        financiamentoPretendido = scanner.nextFloat();
        scanner.nextLine();

        if (financiamentoPretendido <= (remuneracao * 5)) {
            System.out.println("Financiamento Concedido");
        }
        else {
            System.out.println("Financiamento Negado");
        }
        System.out.println("Obrigado por nos consultar!");


        /*
         * Dois carros percorreram diferentes distâncias em diferentes tempos. Sabendo que a velocidade média é a
        razão entre a distância percorrida e o tempo levado para percorrê-la, faça um programa para ler as distâncias
        que cada carro percorreu e o tempo que cada um levou, e indique o carro que teve maior velocidade média.
        */

        String distancia1, distancia2, tempo1, tempo2;
        float velocidadeM1, velocidadeM2;

        System.out.print("Distancia percorrida pelo primeiro: ");
        distancia1 = scanner.nextLine();
        System.out.print("Tempo levado: ");
        tempo1 = scanner.nextLine();

        System.out.print("Distancia percorrida pelo segundo: ");
        distancia2 = scanner.nextLine();
        System.out.print("Tempo levado: ");
        tempo2 = scanner.nextLine();

        velocidadeM1 = ((Float.parseFloat(distancia1) / (Float.parseFloat(tempo1))));
        velocidadeM2 = ((Float.parseFloat(distancia2) / (Float.parseFloat(tempo2))));

        if(Float.compare(velocidadeM1, velocidadeM2) == 1) {
            System.out.println("O carro de número 1 teve maior velocidade");
        }
        else if(Float.compare(velocidadeM1, velocidadeM2) == 0) {
            System.out.println("Os dois carros tiveram velocidades iguais");
        }
        else {
            System.out.println("O carro de número 2 teve maior velocidade");
        }

        /*
         * Faça um programa que leia o nome e idade de duas pessoas e imprima o nome da pessoa mais nova, e seu
        ano de nascimento (o programa deve funcionar corretamente para qualquer que seja o ano atual). 
        */

        String nome1, nome2;
        int idade1, idade2, anoAtual = 2023;

        System.out.println("Nome e Idade da primeira pessoa: ");
        nome1 = scanner.nextLine();
        idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome e Idade da segunda pessoa: ");
        nome2 = scanner.nextLine();
        idade2 = scanner.nextInt();
        scanner.nextLine();


        if (idade1 > idade2) {
            System.out.printf("%s é mais novo, nasceu em %d", nome2, (anoAtual - idade2));
        }
        else if (idade1 == idade2) {
            System.out.printf("Mesma idade. Nasceram em %d", (anoAtual - idade1));
        }
        else {
            System.out.printf("%s é mais novo, nasceu em %d", nome1, (anoAtual - idade1));
        }
        
        /*
        Leia três números e os imprima em ordem crescente, nao utilizando arrays.
        Não é necessário verificar se os números são iguais.
        */

        String num1, num2, num3;
        float numero1, numero2, numero3;
        System.out.println("Entre 3 valores diferentes e diremos qual, dentre eles, é o maior: ");
        num1 = scanner.nextLine();numero1 = Float.parseFloat(num1);
        num2 = scanner.nextLine();numero2 = Float.parseFloat(num2);
        num3 = scanner.nextLine();numero3 = Float.parseFloat(num3);

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("%.2f é o maior, ", numero1);
            if (numero2 > numero3) {
                System.out.printf("%.2f é o do meio, e %.2f é o menor\n", numero2, numero3);
            }
            else if(numero3 > numero2) {
                System.out.printf("%.2f é o do meio, e %.2f é o menor\n", numero3, numero2);
            }
            else {
                System.out.println("Os outros dois numeros sao iguais");
            }
        }
        else if(numero2 >  numero1 && numero2 > numero3) {
            System.out.printf("%.2f é o maior, ", numero2);
            if (numero1 > numero3) {
                System.out.printf("%.2f é o numero do meio, e %.2f é o menor\n", numero1, numero3);
            }
            else if(numero3 > numero1) {
                System.out.printf("%.2f é o número do meio, e %.2f é o menor\n", numero3, numero1);
            }
            else {
                System.out.println("Os outros dois números sao iguais");
            }
        }
        else if(numero3 >  numero1 && numero3 > numero2) {
            System.out.printf("%.2f é o maior, ", numero2);
            if (numero1 > numero2) {
                System.out.printf("%.2f é o numero do meio, e %.2f é o menor\n", numero1, numero2);
            }
            else if(numero2 > numero1) {
                System.out.printf("%.2f é o número do meio, e %.2f é o menor\n", numero2, numero1);
            }
            else {
                System.out.println("Os outros dois números sao iguais");
            }
        }

        /*
        Leia um mês e ano e imprima a quantidade de dias que este mês possui.
        Lembre-se dos anos bissextos
        */
        
        String mes, ano;
        System.out.print("Digite o ano em que voce esta no presente: ");
        ano = scanner.nextLine();
        System.out.print("Agora o mês correspondente: ");
        mes = scanner.nextLine();

        // Usando operador ternário
        boolean bissexto = (Integer.parseInt(ano) %4 == 0 && Integer.parseInt(ano) %100 == 0) ? true : false;

        if (mes.equals("1") || mes.equals("3") || mes.equals("5") || mes.equals("7") || mes.equals("8") || mes.equals("10") || mes.equals("12")) {
            System.out.printf("o mes %s possui 31 dias", mes);
        }
        else if (mes.equals("2")) {
            if (bissexto == true) {
                System.out.println("Esse mes possui 29 dias, porque o ano é bissexto");
            }
            else {
                System.out.println("Esse mes possui 28 dias, porque o ano não é bissexto");
            }
        }
        else if(mes.equals("4") || mes.equals("6") || mes.equals("9") || mes.equals(11)) {
            System.out.printf("o mes %s possui 30 dias", mes);
        }
        else {
            System.out.println("Algo deu errado. Tente novamente");
        }
        
        /*
          . Leia sexo e idade de uma pessoa e imprima maior idade ou menor idade, considerando que sexo masculino 
            e maior idade se maior igual a 21 anos e sexo feminino e maior idade se maior igual a 18 anos
         */
        
        char sexo;
        String idade;

        System.out.print("Qual seu sexo? Digite 'M' para masculino e 'F' para feminino: ");
        sexo = scanner.next().charAt(0);
        scanner.nextLine();

        switch(sexo) {
            case 'M':
                System.out.print("Digite sua idade: ");
                idade = scanner.nextLine();
                if (Integer.parseInt(idade) >= 21) {
                    System.out.println("Maior idade");
                }
                else {
                    System.out.println("Menor idade");
                }
                break;
            case 'F':
                System.out.print("Digite sua idade: ");
                idade = scanner.nextLine();
                if (Integer.parseInt(idade) >= 18) {
                    System.out.println("Maior idade");
                }
                else {
                    System.out.println("Menor idade");
                }
                break;
            default:
                System.out.println("Valor inválido. Tente novamente");
                break;
        }

        /*
        A loja Constrói em Partes produz dois tipos de hastes: cobre e alumínio. Cada haste de cobre é vendida por 
        R$ 2,00, e cada haste de alumínio é vendida por R$ 4,00. O desconto dado dependerá da quantidade de 
        hastes compradas, conforme tabela abaixo. Fazer um algoritmo para ler a quantidade comprada de cada tipo 
        de haste e imprima o total pago.
        */   

        char haste;
        String quant;
        int quantidade;

        System.out.println("Comprou hastes de cobre ou de alumínio? Digite 'C' para cobre e 'A' paa alumínio");
        haste = scanner.next().charAt(0);
        

        switch(haste) {
            case 'C':
                System.out.print("Qual a quantidade de hastes compradas: ");
                quant = scanner.nextLine();
                quantidade = Integer.parseInt(quant);

                if(quantidade < 5 ) {
                    System.out.printf("Valor pago: %d", quantidade * 2);
                }
                else if(quantidade > 5) {
                    if (quantidade <= 15) {
                        System.out.printf("Valort pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 10/100.0)) );
                    }
                    else if(quantidade <= 20) {
                        System.out.printf("Valort pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 15/100.0)) );
                    }
                    else {
                        System.out.printf("Valort pago: %.1f", (float)((quantidade * 2) - (float)((quantidade * 2) * 20/100.0)) );
                    }
                }
                break;
            case 'A':
                System.out.print("Qual a quantidade de hastes compradas: ");
                quant = scanner.nextLine();
                quantidade = Integer.parseInt(quant);

                if(quantidade < 5 ) {
                    System.out.printf("Valor pago: %d", quantidade * 2);
                }
                else if(quantidade > 5) {
                    if (quantidade <= 15) {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 10/100.0)) );
                    }
                    else if(quantidade <= 20) {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 15/100.0)) );
                    }
                    else {
                        System.out.printf("Valor pago: %.2f", (float)((quantidade * 4) - (float)((quantidade * 4) * 20/100.0)) );
                    }
                }
                break;
            default:
                System.out.println("Valor inválido. Tente novamente");
                break;
        }

        /*
        Uma empresa de energia elétrica trabalha com 3 tipos de consumidores: I – Industrial; C – Comercial; R –
        Residencial. Fazer um algoritmo para ler o tipo de consumidor („I‟, „C‟ ou „R‟), a quantidade de energia 
        consumida, e calcular e imprimir qual será o valor pago. Para calcular o valor pago, verificar a tabela abaixo. 
        */
        char consumidor;
        String quantEnergiaCons;
        float energiaConsumida;

        System.out.print("Qual o tipo de consumidor: ");
        consumidor = scanner.next().charAt(0);
        scanner.nextLine();

        switch(consumidor) {
            case 'I':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.68) + 34);
                break;

            case 'C':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.37) + 45);
                break;

            case 'R':
                System.out.print("Quantidade de energia consumida: ");
                quantEnergiaCons = scanner.nextLine();
                energiaConsumida = Float.parseFloat(quantEnergiaCons);
                System.out.printf("Valor a ser pago: %.2f", (energiaConsumida * 0.77) - 22);
                break;

            default:
                System.out.println("Valor inválido. Tente novamente");
                break;
        }

        /* 
            Escrever um algoritmo para ler a hora de início e hora de término de um jogo, ambas expressas em horas e 
            minutos. Calcular e escrever a duração do jogo, também em horas e minutos, considerando que o tempo 
            máximo de duração de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 
            Se o usuário informar horas maiores que 24 ou minutos maiores que 59, informar mensagem de erro: 
            “Entrada de dados não é válida”.
        */

        String horarioInicial, horarioFinal;
        int horaInicio, horaTermino, minInicio, minTermino;

        System.out.println("Use o formato XX:YY");
        
        System.out.print("Hora de início: ");
        horarioInicial = scanner.nextLine();
        String[] splitInicio = horarioInicial.split(":", 0);
        horaInicio = Integer.parseInt(splitInicio[0]); minInicio = Integer.parseInt(splitInicio[1]);

        if ( (horaInicio > 23 || horaInicio < 0) || (minInicio > 59 || minInicio < 0) ) {
            System.out.println("Entrada de dados não é válida");
        }   
        else {
            System.out.print("Hora de término: ");
            horarioFinal = scanner.nextLine();
            String[] splitFinal = horarioFinal.split(":", 0);
            horaTermino = Integer.parseInt(splitFinal[0]); minTermino = Integer.parseInt(splitFinal[1]);
            if ( (horaTermino > 23 || horaTermino < 0) || (minTermino > 59 || minTermino < 0) ) {
                System.out.println("Entrada de dados não é valida");
            }
            else {
                if(horaTermino < horaInicio && minTermino < minInicio) {
                    if (minInicio > 0) {
                        System.out.printf("Duração do jogo: 0h e %dmin", ((60 - minInicio) + minTermino));
                    }
                    else{ 
                        System.out.printf("Duração do jogo: %dh e %dmin", ((24 - horaInicio) + horaTermino), ((60 - minInicio) + minTermino));
                    }
                }
                else if (minTermino < minInicio) {
                     System.out.printf("Duração do jogo: %dh e %dmin", (horaTermino - horaInicio), ((60 - minInicio) + minTermino));
                }
                else if (horaTermino < horaInicio){
                    System.out.printf("Duração do jogo: %dh e %dmin", ((24 - horaInicio) + horaTermino), (minTermino - minInicio));
                }
            }
        }
        scanner.close();
    }   
}
 
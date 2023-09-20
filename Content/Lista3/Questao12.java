package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        
        /*
        Faça um algoritmo que leia a altura e o sexo de n pessoas e imprima:
        a) - Quantos homens e mulheres foram medidas;
        b) - Quantos homens acima de 1,70;
        c) - A média das alturas das mulheres.
        */
        
        Scanner scan = new Scanner(System.in);

        // Definição de variaveis
        int
        quantHomens = 0,
        quantHomensAcima = 0,
        quantMulheres = 0,
        quantidadep = 0;
        char sexo = ' ';
        float 
        altura,
        somaAlturaMulheres = 0,
        somaAlturaHomens = 0;

            try {
                System.out.print("Quantidade de Pessoas que vamos analizar as alturas: ");
                quantidadep = scan.nextInt();
        
                int contador = 1;
                System.out.println("Digite M para masculino e F para feminino.Digite as alturas em centímetros");
                while (contador <= quantidadep) {   
                        System.out.print("Sexo pessoa " + contador + ": ");
                        sexo = scan.next().charAt(0);
                        scan.nextLine();

                    switch(sexo) {
                        case 'M':
                            quantHomens++;
                            System.out.print("Altura do homen " + quantHomens + ": ");
                            altura = scan.nextFloat();
                            somaAlturaHomens = somaAlturaHomens + altura;
                            if (altura > 170) {
                                quantHomensAcima++;
                            }
                            break;

                        case 'F':
                            quantMulheres++;
                            System.out.print("Altura da mulher " + quantMulheres + ": ");
                            altura = scan.nextFloat();
                            somaAlturaMulheres = somaAlturaMulheres + altura;
                            break;

                        default:
                            System.out.println("Valor inválido. Tente novamente");
                            break;
                    }
                    contador++;
                }                
            }
            catch(Exception e) {
                System.out.println("Algo deu errado. Tente novamente\n");
            }
        

        if(quantidadep > 0) {
            System.out.printf("\nQuantidade Pessoas medidas: %d\nDesses, %d são homens e %d mulheres\n", quantidadep, quantHomens, quantMulheres);
            System.out.printf("Quantidade de Homens acima de 1,70 de altura: %d\n", quantHomensAcima);
            System.out.printf("Média da altura das mulheres: %.2f\n", ((float)somaAlturaMulheres / quantMulheres));
            System.out.printf("Média da altura dos homens: %.2f\n", ((float)somaAlturaHomens / quantHomens));
        }
        scan.close();
    }
}


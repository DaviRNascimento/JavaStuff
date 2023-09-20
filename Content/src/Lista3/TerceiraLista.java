package AtividadesLab2;
import java.util.Scanner;


public class TerceiraLista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        Faça um algoritmo que gere e imprima uma lista com os números de 1 a 10 em ordem
        crescente. 
        */
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
            if(i == 10) {
                System.out.print("\n");
            }
        }

        int j = 1;
        while(j < 11) {
            System.out.println(j);
            if (j == 10) {
                System.out.print("\n");
            }
            j++;

        }

        /*
        Faça um programa que escreve na tela a mesma frase 10 vezes. E depois faça com
        que o programa mostre o número de cada linha no início e no final da linha, conforme
        ex:
        */
        for(int a = 1; a < 11; a++) {
            System.out.println(a + " Eu sou um programador Java! " + a);
            if (a == 10) {
                System.out.print("\n");
            }
        }

        int b = 1;
        do {
            System.out.println(b + " Eu sou um programador Java! " + b);
            if(b == 10){
                System.out.print("\n");
            }
            b++;
        }
        while (b < 11);

        /*
        Faça um programa que vai pedindo números ao usuário até que este introduza o
        número -1. O computador deve dizer a média dos números introduzidos (excluindo o -
        1).
        */
        
    }
}

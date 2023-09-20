package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Faça um programa que vai pedindo números ao usuário até que este introduza o
        número -1. O computador deve dizer a média dos números introduzidos (excluindo o -
        1). 
        */
        float total = 0, num = 0;
        int quantidade = 0;

        while(true) {
            System.out.print("número: ");
            num = scanner.nextFloat();
            
            if (num == 0){
                break;
            }
            else {
                total = total + num;
                quantidade = quantidade + 1;
            }
        }
        if (quantidade == 0) {
            System.out.println("Nnehum valor foi digitado.");
        }
        else if(quantidade < 2) {
            System.out.printf("Somente um valor foi digitado, sendo ele: %.2f", total);
        }
        else {
            float mediaNumeros = (total / quantidade);
            System.out.printf("Media ponderada dos valores digitados: %.2f", mediaNumeros);
        }
        scanner.close();
    }
}

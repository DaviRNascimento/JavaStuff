package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Leia três números e os imprima em ordem crescente, nao utilizando arrays.
        Não é necessário verificar se os números são iguais.
        */

        String num1, num2, num3;
        float numero1, numero2, numero3;
        System.out.println("Entre 3 valores diferentes e diremos qual, dentre eles, é o maior: ");
        num1 = scanner.nextLine();
        num2 = scanner.nextLine();
        num3 = scanner.nextLine();

        // Passando para float:
        numero1 = Float.parseFloat(num1);
        numero2 = Float.parseFloat(num2);
        numero3 = Float.parseFloat(num3);

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
            System.out.printf("%.2f é o maior, ", numero3);
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
        else {
            if (numero1 == numero2) {
                if (numero3 > numero1 && numero3 > numero2) {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o maior", numero1, numero2, numero3);
                }
                else {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o menor", numero1, numero2, numero3);
                }
            }
            else if (numero2 == numero3) {
                if (numero1 > numero2 && numero1 > numero3) {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o maior", numero2, numero3, numero1);
                }
                else {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o menor", numero2, numero3, numero1);
                }
            }
            else if(numero3 == numero1) {
                if (numero2 > numero1 && numero2 > numero3) {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o maior", numero3, numero1, numero2);
                }
                else {
                    System.out.printf("%.2f e %.2f são iguais e %.2f o menor", numero3, numero1, numero2);
                }
            }
        }
        scanner.close();
    }
}
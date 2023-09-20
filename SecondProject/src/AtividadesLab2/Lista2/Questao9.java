package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;


public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que leia o nome e idade de duas pessoas e imprima o nome da pessoa mais nova, e seu
        ano de nascimento (o programa deve funcionar corretamente para qualquer que seja o ano atual). 
        */

        String nome1, nome2;
        int idade1, idade2, anoAtual;

        System.out.print("Nome e Idade da primeira pessoa\nNome: ");
        nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome da segunda pessoa: ");
        nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        idade2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Em qual ano voce esta atualmente? Exemplo 2023, 2022...\n: ");
        anoAtual = scanner.nextInt();
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
        scanner.close();
    }
}

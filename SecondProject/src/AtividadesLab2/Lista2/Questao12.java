package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao12 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Leia sexo e idade de uma pessoa e imprima maior idade ou menor idade, considerando que sexo masculino 
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
        scanner.close();
    }
}

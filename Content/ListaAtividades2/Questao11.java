package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}

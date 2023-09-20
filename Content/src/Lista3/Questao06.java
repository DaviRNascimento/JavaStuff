package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;


public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Inicializar as variáveis FATORIAL e CONTADOR com 1; Solicitar o valor de um número
        para calcular o seu fatorial; Multiplicar sucessivamente a variável FATORIAL pela
        variável CONTADOR; Incrementar 1 à variável CONTADOR, efetuando o controle até
        o valor solicitado; Apresentar ao final o valor obtido.
        */
        int fatorial;
        int total = 1;

        System.out.print("Número: ");
        fatorial = scanner.nextInt();

        for(int i = fatorial; i > 0; i--){
            total = total * i;
        }
        System.out.println(total);
        scanner.close();
    }
}

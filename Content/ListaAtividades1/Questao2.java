package AtividadesLab2.exercises.Lista1;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.printf("Voce fez %skm, em média, por litro de gasolina.\n\n ", quilometragem);

    }
}

import java.util.Scanner;

public class MenuCadastroClientes {
    public static void mostrandoMenu() {
        Scanner enteredData = new Scanner(System.in);
        byte option;

        System.out.println("\nCadastro de Clientes\n" +
                "0 - FIM\n" +
                "1 - INCLUI\n" +
                "2 - ALTERA\n" +
                "3 - EXCLUI\n" +
                "4 - CONSULTA\n" +
                "OPÇÃO: \n");

        option = enteredData.nextByte();
        switch(option) {
        case 1:
            System.out.println("Usuário adicionado!");
            break;
        case 2:
            System.out.println("Usuário Alterado!");
            break;
        case 3:
            System.out.println("Usuário Excluído!");
            break;
        case 4:
            System.out.println("Consultando seus dados...");
            break;
        }
    }
}

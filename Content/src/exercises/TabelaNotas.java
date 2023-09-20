import java.util.Scanner;

public class TabelaNotas {
    // variaveis que armazenam os nomes e notas:
    static String nomeAluno1, nomeAluno2, nomeAluno3, nomeAluno4;
    static float notaAluno1, notaAluno2, notaAluno3, notaAluno4;

    // objeto para receber input de dados:
    static Scanner enteredData = new Scanner(System.in);
    public static void fazerTabela() {
        pedirDados();
        System.out.println("ALUNO(A) / NOTA");
        System.out.println("======== / ====");
        System.out.println((nomeAluno1 + " / " + notaAluno1) + "\n" +
                        (nomeAluno2 + " / " + notaAluno2) + "\n" +
                        (nomeAluno3 + " / " + notaAluno3) + "\n" +
                (nomeAluno4 + " / " + notaAluno4) + "\n");
    }
    public static void pedirDados(){
        System.out.println("Digite primeiro os 4 nomes e depois as 4 respectivas notas, na mesma ordem dos nomes:");
            nomeAluno1 = enteredData.nextLine();
            nomeAluno2 = enteredData.nextLine();
            nomeAluno3 = enteredData.nextLine();
            nomeAluno4 = enteredData.nextLine();
            notaAluno1 = enteredData.nextInt();
            notaAluno2 = enteredData.nextInt();
            notaAluno3 = enteredData.nextInt();
            notaAluno4 = enteredData.nextInt();
        }
}


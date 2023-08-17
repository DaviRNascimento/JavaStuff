public class Main {
    public static void main(String[] args) {
        // definição de objetos para chamar métodos posteriomente:
        Quadrado firstObj = new Quadrado();
        TabelaNotas secondObj = new TabelaNotas();
        LetraGrande thirdObj = new LetraGrande();
        MenuCadastroClientes fourthObj = new MenuCadastroClientes();
        Pinheiro fifithObj = new Pinheiro();
        Forca sixthObj = new Forca();
        ConverterAlgoritmo seventhObj = new ConverterAlgoritmo();

        System.out.println("Fazendo quadrado: \n");
        firstObj.fazerQuadrado();
        System.out.println("\n\nFazendo tabela de alunos e notas:\n");
        secondObj.fazerTabela();
        thirdObj.fazendoLetra();
        fourthObj.mostrandoMenu();
        fifithObj.fazendoPinheiro();
        System.out.println("Segue-se uma Forca");
        sixthObj.fazendoForca();
        seventhObj.convertendo();

        }
    }
package AtividadesLab2.exercises.Lista3;

public class Questao02 {
    public static void main(String[] args) {
        /*
        Faça um programa que escreve na tela a mesma frase 10 vezes. E depois faça com
        que o programa mostre o número de cada linha no início e no final da linha, conforme
        ex:
        */
        for(int a = 1; a < 11; a++) {
            System.out.println(a + " Eu sou um programador Java! " + a);
            if (a == 10) {
                System.out.print("\n");
            }
        }

        int b = 1;
        do {
            System.out.println(b + " Eu sou um programador Java! " + b);
            if(b == 10){
                System.out.print("\n");
            }
            b++;
        }
        while (b < 11);
    }
}

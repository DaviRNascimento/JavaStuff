package AtividadesLab2.exercises.Lista3;

public class Questao01 {
    public static void main(String[] args) {
         /*
        Faça um algoritmo que gere e imprima uma lista com os números de 1 a 10 em ordem
        crescente. 
        */
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
            if(i == 10) {
                System.out.print("\n");
            }
        }

        int j = 1;
        while(j < 11) {
            System.out.println(j);
            if (j == 10) {
                System.out.print("\n");
            }
            j++;

        }
    }
}

package AtividadesLab2.exercises.Lista3;

public class Questao04 {
    public static void main(String[] args){ 
        /*
        Faça um algoritmo para somar os restos da divisão por 3 de 200 números inteiros.
        */
        double soma = 0;
        for(int i = 0; i < 200; i++) {
            int num = (int)(Math.random() * 1000);
            soma = soma + (num % 3);
        }
        System.out.println(soma);
    }
}

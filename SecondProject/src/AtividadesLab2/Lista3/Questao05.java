package AtividadesLab2.exercises.Lista3;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float maiorAltura = 0f, segundaMaiorAltura = 0f;
        float altura;
        
        while(true) {
            System.out.print("Digite a altura da moça (ou 0 para sair): ");
            altura = scanner.nextFloat();

            if (altura == 0){
                // Sai do loop
                break;
            }
            else {
                if (altura > maiorAltura) {
                segundaMaiorAltura = maiorAltura;
                maiorAltura = altura;
                }
                else if (altura == maiorAltura) {
                    maiorAltura = altura;
                }
                else if (altura > segundaMaiorAltura && altura < maiorAltura) {
                    segundaMaiorAltura = altura;
                }
            }            
        }
        
        if (maiorAltura == 0 && segundaMaiorAltura == 0) {
            System.out.println("Nenhuma altura foi digitada");
        }
        else if ( segundaMaiorAltura == 0) {
            System.out.printf("A maior altura é: %.2f\n", maiorAltura);
        }
        else {
            System.out.printf("As duas maiores alturas são: %.2f e %.2f\n", maiorAltura, segundaMaiorAltura);
        }

        scanner.close();
    }
}

package AtividadesLab2.exercises.Lista2;
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 
        Escrever um algoritmo para ler a hora de início e hora de término de um jogo, ambas expressas em horas e 
        minutos. Calcular e escrever a duração do jogo, também em horas e minutos, considerando que o tempo 
        máximo de duração de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 
        Se o usuário informar horas maiores que 24 ou minutos maiores que 59, informar mensagem de erro: 
        “Entrada de dados não é válida”.
        */

        String horarioInicial, horarioFinal;
        int horaInicio, horaTermino, minInicio, minTermino;

        System.out.println("Use o formato XX:YY");
        
        System.out.print("Hora de início: ");
        horarioInicial = scanner.nextLine();
        String[] splitInicio = horarioInicial.split(":", 0);
        horaInicio = Integer.parseInt(splitInicio[0]); minInicio = Integer.parseInt(splitInicio[1]);

        if ( (horaInicio > 23 || horaInicio < 0) || (minInicio > 59 || minInicio < 0) ) {
            System.out.println("Entrada de dados não é válida");
        }   
        else {
            System.out.print("Hora de término: ");
            horarioFinal = scanner.nextLine();
            String[] splitFinal = horarioFinal.split(":", 0);
            horaTermino = Integer.parseInt(splitFinal[0]); minTermino = Integer.parseInt(splitFinal[1]);
            if ( (horaTermino > 23 || horaTermino < 0) || (minTermino > 59 || minTermino < 0) ) {
                System.out.println("Entrada de dados não é valida");
            }
            else {
                if(horaTermino < horaInicio && minTermino < minInicio) {
                    if (minInicio > 0) {
                        System.out.printf("Duração do jogo: 0h e %dmin", ((60 - minInicio) + minTermino));
                    }
                    else{ 
                        System.out.printf("Duração do jogo: %dh e %dmin", ((24 - horaInicio) + horaTermino), ((60 - minInicio) + minTermino));
                    }
                }
                else if (minTermino < minInicio) {
                     System.out.printf("Duração do jogo: %dh e %dmin", (horaTermino - horaInicio), ((60 - minInicio) + minTermino));
                }
                else if (horaTermino < horaInicio){
                    System.out.printf("Duração do jogo: %dh e %dmin", ((24 - horaInicio) + horaTermino), (minTermino - minInicio));
                }
            }
        }
        scanner.close();
    }
}

package AtividadesLab2;
import java.util.Scanner;

public class HouraAndMinCalculator {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
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


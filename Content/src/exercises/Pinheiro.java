
public class Pinheiro {
    public static void fazendoPinheiro() {
        String galhosPinheiro = "x";
        int repetition = 1;
        String space = " ";

        System.out.println("Segue-se um pinheiro: \n");

        //topo do Pinheiro:
        for (int i = 7; i > 0; i--) {
            System.out.print(space.repeat(i));
            if(repetition == 1) {
                System.out.println(galhosPinheiro.repeat(repetition));
            }
            else if(repetition >1 ){
                System.out.println(galhosPinheiro.repeat(repetition - 1) + "O" + galhosPinheiro.repeat(repetition-1));
            }
            repetition = repetition + 1;
        }
        for(int w = 0; w < 2; w++) {
            System.out.print(space.repeat(6));
            System.out.println(galhosPinheiro.repeat(3));
            }
        System.out.println(space.repeat(5) + galhosPinheiro.repeat(5));
        }


    }



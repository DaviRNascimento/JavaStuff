public class Forca {
    public static void fazendoForca(){
        String space = " ";
        System.out.print(space.repeat(2));
        for(int i = 0; i < 7; i++) {
            System.out.print("_");
        }
        for (int j = 0; j < 2; j++) {
            System.out.println(space.repeat(2) + "|" + space.repeat(5) + "|");
        }
        System.out.println(space.repeat(2) + "|" + space.repeat(5) + "O");
        System.out.println(space.repeat(2) + "|" + space.repeat(4) + "/|\\");
        System.out.println(space.repeat(2) + "|" + space.repeat(5) + "|");
        System.out.println(space.repeat(2) + "|" + space.repeat(4) + "/ \\");
        for(int i = 0; i < 3; i++){
            System.out.println(space.repeat(2) + "|");
        }
            System.out.println("_".repeat(5));
    }   }

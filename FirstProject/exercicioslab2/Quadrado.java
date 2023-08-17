public class Quadrado {
    public static void fazerQuadrado() {
        basesQuadrado();
        System.out.print("\n");
        for (int i = 0; i < 3; i++){
            System.out.println("x   x");
        }
        basesQuadrado();
    }
    public static void basesQuadrado() {
        // base e parte de cima da figura geométrica:
        for (int i = 0; i < 5; i++) {
            System.out.print("x");
        }
    }
}

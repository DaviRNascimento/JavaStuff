public class ConverterAlgoritmo {
    public static void convertendo() {
        // Algoritmo Mitsério

        int num, a, b, c, d;
        num = 2459;
        System.out.println("O número Inteiro de 4 Dígitos é: " + num);

        a = (num / 100) % 10;
        b = (num % 100) / 10;
        c = (num % 100) % 10;
        d = num/1000;

        System.out.print("Resultado: " + d + ", "
                            + a + ", "
                            + b + ", "
                            + c + ".");
    }
}

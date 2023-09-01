public class App {
    public static void main(String[] args) {
        /*
        * Casting is when we are assigning a value of one primitive data type to another type
        */

        // Widening Casting -> Smaller to a Larger
        // Narrowing Casting -> Larger to a Smaller

        byte firstValue = 127;
        int secondValue = firstValue;

        double firstFloatingPointValue = 10.65;
        float secondFloatingPointValue = (float) firstFloatingPointValue;

        System.out.println(((Object)firstValue).getClass().getSimpleName());
        System.out.println(((Object)secondValue).getClass().getSimpleName());

        System.out.println(((Object)firstFloatingPointValue).getClass());
        System.out.println(((Object)secondFloatingPointValue).getClass().getSimpleName());
    }
}
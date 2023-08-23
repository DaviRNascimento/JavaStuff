import java.util.Arrays;

public class Listas {
    /*
    for (initialization; termination; increment) {
        statement(s)
    }

        The INITIALIZATION expression initializes the loop; it's executed once, as the loop begins.
        When the TERMINATION expression evaluates to false, the loop terminates.
        The INCREMENT expression is invoked after each iteration through the loop.
    */
    public static void makingArrays() {
        String[] names = {"Davi", "Andressa", "Meire", "Elisa"};
            for(String i : names) {
                System.out.print(i);
            }
            // The size of the array cannot be changed  dynamically in java
        int[] numbers = {10,20,30};
        System.out.println(Arrays.toString(numbers));
        }
    }

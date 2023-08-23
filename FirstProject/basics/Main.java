import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dataObj = new Scanner(System.in);
        System.out.println("Enter the week day you're at the moment: ");
        byte first = (byte)dataObj.nextInt();
        System.out.println("What time is it: ");
        byte second = (byte)dataObj.nextInt();

        // we created new objects from the classes:
        SwitchStatement secondObj = new SwitchStatement();
        ShortHandIfElse thirdObj = new ShortHandIfElse();
        WhileLoop forthObj = new WhileLoop();
        Listas fifthObj = new Listas();

        secondObj.switchStatement(first);
        thirdObj.ternaryOperator(second);
        int defaultValue = forthObj.whileLoop(1);
        fifthObj.makingArrays();

        System.out.println("While Loop Returned Value: " + defaultValue);

        // Using Arrays and ADDING new elements:
        int[] numbers = {10,20,30};
        int[] otherNumbers; // if we want to create another array, its necessary to declare the variable
        System.out.println(Arrays.toString(numbers)); // output: [10,20,30]

        otherNumbers = Arrays.copyOf(numbers, numbers.length+1);
        otherNumbers[otherNumbers.length - 1] = 40;
        System.out.println(Arrays.toString(otherNumbers));

    }
}
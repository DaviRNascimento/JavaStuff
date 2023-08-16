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

        secondObj.switchStatement(first);
        thirdObj.ternaryOperator(second);
    }
}
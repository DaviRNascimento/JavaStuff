import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        // Declaring the variables
        int value1;
        char value2;
        String name;

        // Create Scanner Class Object to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        name = scanner.nextLine();

        System.out.println("Enter an aleatory Integer Number: ");
        value1 = scanner.nextInt();

        System.out.println("Enter a only character: ");
        // we take the first character at the beggining of the input line
        value2 = scanner.next().charAt(0);

        // Closing Scanner class object
        scanner.close();

        System.out.println(((Object)value1).getClass().getSimpleName());
        System.out.println(((Object)value2).getClass().getSimpleName());
        System.out.println(name.getClass().getSimpleName());
    }
}

import java.util.Scanner;

public class Main {        
    // Creating objects of the necessary classes
    private static Scanner scanner = new Scanner(System.in);
    private static Math math = new Math();

    public static void main(String[] args) {
        // variables
        double[] operands = new double[2];
        char option;

        while(true) {
            // Asking the Option
            option = option();

            switch(option) {
                case '+':
                    operands = operands();
                    System.out.printf("Result: %.2f\n", math.sum(operands[0], operands[1]));
                    break;
                
                case '-':
                    operands = operands();
                    System.out.printf("Result: %.2f\n", math.subtraction(operands[0], operands[1]));    
                    break;

                case '*':
                    operands = operands();
                    System.out.printf("Result: %.2f\n", math.multiplication(operands[0], operands[1]));
                    break;
                
                case '/':
                    operands = operands();
                    math.division(operands[0], operands[1]);
                    break;

                default:
                    System.out.println("Invalid Value. Try again\n");
            }
        }
    }

    // Option choosing Function
    static char option() {
        char option;
   
        System.out.print("Which type of operation would you like to operate? (+ - * /)\nOption: ");
        option = scanner.next().charAt(0);
        scanner.nextLine();        
        return option;        
    }

    // Function to receive the operands and store inside the array
    static double[] operands() {
        double[] operands = new double[2];

        try {
            System.out.print("First Number: ");
            operands[0] = scanner.nextDouble();

            System.out.print("Second Number: ");
            operands[1] = scanner.nextDouble();
            return operands;
        }
        catch(Exception e) {
            System.out.println("Something went wrong. Try again");
            // to avoid infinite loops:
            scanner.nextLine();
            return operands();
        }
    }
}

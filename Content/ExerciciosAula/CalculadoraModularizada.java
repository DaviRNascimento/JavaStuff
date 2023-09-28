import java.util.Scanner;

public class CalculatorModularized {
    // Creating an object of the class Scanner that i can access inside the entire class
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        
        System.out.println("Welcome to the Davi's Calculator!\n");
        
        // Variables
        char option;
        double[] numbers = new double[2];

        while(true) {
            // Asking the Option
            option = option();

                switch(option) {
                    case '+':
                        numbers = operands();
                        System.out.printf("Result: %.2f\n", soma(numbers[0], numbers[1]));
                        break;
                    
                    case '-':
                        numbers = operands();
                        System.out.printf("Result: %.2f\n", subtracao(numbers[0], numbers[1]));
                        break;

                    case '*':
                        numbers = operands();
                        System.out.printf("Result: %.2f\n", multiplicacao(numbers[0], numbers[1]));
                        break;
                    
                    case '/':
                        numbers = operands();
                        divisao(numbers[0], numbers[1]);
                        break;

                    default:
                        System.out.println("Invalid Value");
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

    static double[] operands() {
        double[] numbers = new double[2];

        while (true) {
            try {
                System.out.print("Number 1: ");
                numbers[0] = scanner.nextDouble();

                System.out.print("Number 2: ");
                numbers[1] = scanner.nextDouble();
                break;
            }
            catch(Exception e) {
                System.out.println("Something Went Wrong. Try again");
                scanner.nextLine();
            }
        }
        return numbers;
    }

    static double soma(double a, double b) {
        return(a + b);
    }

    static double subtracao(double a, double b) {
        return (a - b);
    }

    static double multiplicacao(double a, double b) {
        return (a * b);
    }

    static void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("It's not possible divide by zero\n");
        }
        else {
            System.out.printf("Result: %.2f\n\n", (a / b));
        }
    }
}

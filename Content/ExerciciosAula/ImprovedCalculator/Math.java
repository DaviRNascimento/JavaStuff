public class Math {
    // sum
    public double sum(double a, double b) {
        return (a + b);
    }

    // substraction
    public double subtraction(double a, double b) {
        return (a - b);
    }

    // multiplication
    public double multiplication(double a, double b) {
        return (a * b);
    }

    // division procedure
    public void division(double a, double b) {
        if (b == 0) {
            System.out.println("Its impossible to divide by zero");
        }
        else {
            System.out.println(a / b);
        }
    }
}


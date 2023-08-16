public class IfElseStatements {
    public static void myMethod(float x, double y) {
        if (y > x) {
            System.out.println("y is bigger than x");
        } else if (x == y) {
            System.out.println("They're equal");
        } else {
            System.out.print("x is bigger than y");
        }
    }
}

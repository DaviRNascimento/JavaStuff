public class Main {
    public static void main(String[] args) {
        // We first create a new object from the classes;:
        IfElseStatements x = new IfElseStatements();
        ShortHandIfElse y = new ShortHandIfElse();

        // And then we're able to call their methods:
        x.myMethod(10.54f, 12.65d);
        y.ternaryOperator((byte)18);
    }
}
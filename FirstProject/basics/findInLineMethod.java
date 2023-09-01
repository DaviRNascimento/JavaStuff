import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name = "Davi Devandro David Daniel Daniela";
        Scanner scanner = new Scanner(name);
        // scanner.findInLine("D");  
        System.out.println("Inline Finded Element: " + scanner.findInLine(""));
    }         
}

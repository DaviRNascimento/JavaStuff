import java.util.Scanner;

public class charAt {
    public static void main(String[] agrs) {
      Scanner scanner = new Scanner(System.in);
      String names = scanner.nextLine();

      // When comparing characters in java we must use Single Quotes!
      System.out.print("The letter D was founded in the following positions: ");
      for (int i = 0; i < names.length(); i++) {
        if(names.charAt(i) == 'D') {
        System.out.print(i + ", ");
        }
      }
    }
}
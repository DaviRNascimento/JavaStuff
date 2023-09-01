import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String info = "Davi ama Maria ama Andressa ama Meire ama Marcos";
        Scanner scan =  new Scanner(info).useDelimiter("\sama\s");
        while(scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}

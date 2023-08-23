import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] clientsCode = {};
        float[] clientsHeight = {};
        float[] clientsWeight = {};

        System.out.println("");
        Scanner enteredData = new Scanner(System.in);

        while (clientsCode.length < 5) {
            System.out.println("Client Code: ");
            int clientCode = enteredData.nextInt();

            // appending the value into the list:
            clientsCode = Arrays.copyOf(clientsCode, clientsCode.length+1);
            clientsCode[clientsCode.length -1] = clientCode;

            System.out.println("Height: ");
            float clientHeight = enteredData.nextFloat();
            clientsHeight[clientsHeight.length - 1] = clientHeight;

            System.out.println("Weight: ");
            float clientWeight = enteredData.nextFloat();
            clientsWeight[clientsWeight.length - 1] = clientWeight;
        }
    }
}
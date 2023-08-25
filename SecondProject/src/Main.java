import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arrays to store the infos
        int[] clientsCode = {};
        float[] clientsHeight = {};
        float[] clientsWeight = {};
        Scanner enteredData = new Scanner(System.in);

        // first message
        System.out.println("");

        while (clientsCode.length < 3) {
            System.out.println("Client Code: ");
            int clientCode = enteredData.nextInt();

            // we create a new array from the old one
            clientsCode = Arrays.copyOf(clientsCode, clientsCode.length + 1);
            // and then append the input
            clientsCode[clientsCode.length -1] = clientCode;

            System.out.println("Height: ");
            float clientHeight = enteredData.nextFloat();
            clientsHeight = Arrays.copyOf(clientsHeight, clientsHeight.length + 1);
            clientsHeight[clientsHeight.length - 1] = clientHeight;

            System.out.println("Weight: ");
            float clientWeight = enteredData.nextFloat();
            clientsWeight = Arrays.copyOf(clientsWeight, clientsWeight.length + 1);
            clientsWeight[clientsWeight.length - 1] = clientWeight;
        }

        showingData(clientsCode, clientsHeight, clientsWeight);
    }

    public static void showingData(int[] clientsCode, float[] clientsHeight, float[] clientsWeight) {
        // Set up the arrays in ascendant order
        Arrays.sort(clientsCode);
        Arrays.sort(clientsHeight);
        Arrays.sort(clientsWeight);

        float highestClient = clientsHeight[clientsHeight.length-1];
        float heaviestClient = clientsWeight[clientsWeight.length-1];

        // It'll print the higher and the heaviest client
        System.out.println("This is the higher client: " + clientsCode[Arrays.binarySearch(clientsHeight, highestClient)] +
                            "And this is the heaviest: " + clientsCode[Arrays.binarySearch(clientsWeight, heaviestClient)]);
    }
}
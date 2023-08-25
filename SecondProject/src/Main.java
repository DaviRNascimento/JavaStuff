// Importing Necessary classes
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arrays to store the infos
        int[] clientsCode = {};
        float[] clientsHeight = {};
        float[] clientsWeight = {};

        // Scanner object
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

        returnGreaterValue(clientsHeight);
        returnGreaterValue(clientsWeight);

        returnSorted(clientsHeight);
        returnSorted(clientsWeight);


    }

    // method to get the GREATER VALUE inside the array
    public static float returnGreaterValue(float[] arr) {
        float max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max=arr[i];
            }
        }
       return max;
    }

    // method that returns the ASCENDANT SORTED LIST
    public static void returnSorted(float[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // method to return the AVERAGE
    public static void returnAverage(float[] arr) {
        
    }

}
import java.util.Scanner;

public class MediaSalarios {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // defining variables
        int funcQuantity, sum = 0;
        double SalarieVet[];
        float average;

        System.out.print("Informe a quantidade de funcionarios: ");

        // iterator
        int index = 0;

        try {
            funcQuantity = scanner.nextInt();
            SalarieVet = new double[funcQuantity];
            
            while(index < SalarieVet.length) {
                System.out.print("Informe o salario do funcionario " + (index + 1) + " funcionario: ");
                SalarieVet[index] = scanner.nextDouble();
                
                index++;
            }

            // summing the values and storing inside the variable
            for(int i = 0; i < SalarieVet.length; i++) {
                sum += SalarieVet[i];
            }

            average = (sum / SalarieVet.length);
            System.out.printf("average dos salarios: %.2f\n", average);

            // Checking the salaries and noticing if there is one below average 
            for(int i = 0; i < SalarieVet.length; i++) {
                if(SalarieVet[i] < average) {
                    System.out.println("Functionary number " + (i + 1) + " below the average\n");
                }
            }
        }
        catch(Exception e) {
            System.out.println("Something Went wrong!");
        }
        
        // closing the Scanner instance
        scanner.close();
    }
}

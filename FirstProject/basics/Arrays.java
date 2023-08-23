public class Arrays {
    public static void makingArrays() {
        String[] cars = {"Volvo", "BMW", "Chevrolet"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            //output: "Volvo, BMW, Chevrolet
        }
        // Using For-each Loop:
        for (String j : cars) {
            System.out.println(j);
        }

        // Multi-dimensional Array:
        int[][] table = {{1, 2, 3}, {4, 5, 6}};
        // specify two indexes: one for the array, and one for the element inside that array.
        System.out.println(table[0][2]);


    }
}

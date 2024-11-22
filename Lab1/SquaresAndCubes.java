package lab1.java;

//Question6

public class SquaresAndCubes {

    public static void main(String[] args) {
        // Print the header of the table
        System.out.printf("%-10s %-10s %-10s%n", "Number", "Square", "Cube");
        System.out.println("----------------------------------");

        // Loop through numbers from 0 to 10
        for (int i = 0; i <= 10; i++) {
            int square = i * i;       // Calculate square
            int cube = i * i * i;     // Calculate cube

            // Print the number, square, and cube in table format
            System.out.printf("%-10d %-10d %-10d%n", i, square, cube);
        }
    }
}
 
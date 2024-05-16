public class InvertedTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the inverted triangle

        // Outer loop for the number of rows
        for (int i = rows; i >= 1; i--) {

            // Inner loop to print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

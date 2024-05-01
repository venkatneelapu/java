public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        
        // Loop to iterate through rows
        for (int i = 0; i < rows; i++) {
            // Loop to print stars in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

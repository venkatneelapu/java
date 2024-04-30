public class RowMatrixExample {
    public static void main(String[] args) {
        // Define a row matrix
        int[][] rowMatrix = {
            {1, 2, 3, 4} // This row matrix has 1 row and 4 columns
        };

        // Print the row matrix
        System.out.println("Row Matrix:");
        printMatrix(rowMatrix);

        // Accessing elements of the row matrix
        int element = rowMatrix[0][2]; // Accessing the element at row 0, column 2
        System.out.println("Element at row 0, column 2: " + element);

        // Modifying elements of the row matrix
        rowMatrix[0][1] = 5; // Changing the element at row 0, column 1 to 5
        System.out.println("Modified Row Matrix:");
        printMatrix(rowMatrix);
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class PrintQ {
    public static void main(String[] args) {
        int size = 7;  // Adjust the size for a larger or smaller Q

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Printing conditions for "Q"
                if ((i == 0 && j > 0 && j < size - 1) || // Top horizontal line (excluding corners)
                    (i == size - 1 && j > 0 && j < size - 1) || // Bottom horizontal line (excluding corners)
                    (j == 0 && i > 0 && i < size - 1) || // Left vertical line (excluding corners)
                    (j == size - 1 && i > 0 && i < size - 1) || // Right vertical line (excluding corners)
                    (i == j && i >= size / 2) // Diagonal line for the tail
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
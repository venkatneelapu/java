public class PrintX {
    public static void main(String[] args) {
        int size = 7; // You can change the size to any value you want

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Print stars on the main diagonal and the anti-diagonal
                if (col == row || col == size - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

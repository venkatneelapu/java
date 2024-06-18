public class PrintZ {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Print star for the first row, last row, and the diagonal from top-right to bottom-left
                if (row == 0 || row == height - 1 || col == height - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class PrintU {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Print star for the first column, last column, and bottom row (excluding corners)
                if (col == 0 || col == height - 1 || (row == height - 1 && col > 0 && col < height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

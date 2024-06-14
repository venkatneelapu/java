public class PrintW {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col <= height * 2; col++) {
                // Print stars for the left and right sides, and the inner diagonals
                if (col == 0 || col == height * 2 || 
                    (row == col - height && row > height / 2) ||
                    (row + col == height * 2 && row > height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

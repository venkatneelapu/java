public class PrintY {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Print stars for the upper V shape and the vertical line at the bottom
                if ((row == col && row < height / 2) || (col == height - row - 1 && row < height / 2) || 
                    (row >= height / 2 && col == height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

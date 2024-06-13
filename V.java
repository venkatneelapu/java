public class PrintV {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height * 2 - 1; col++) {
                // Print stars for the left and right sides of the "V"
                if (col == row || col == height * 2 - 2 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
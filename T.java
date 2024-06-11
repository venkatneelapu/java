public class PrintT {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want
        int width = 7;  // Typically, width is the same as height for proportional letters

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // Print stars for the top row and the middle column
                if (row == 0 || col == width / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class PrintS {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want
        int width = 5; // Adjust the width according to your height

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // Print stars for the top, middle, and bottom rows, and the corners to shape "S"
                if ((row == 0 || row == height / 2 || row == height - 1) || 
                    (col == 0 && row < height / 2) || 
                    (col == width - 1 && row > height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
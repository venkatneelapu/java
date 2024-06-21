public class PrintNumber2 {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want
        int width = height; // Typically, for simplicity, we use a square grid

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // Conditions to print stars for the shape of the number "2"
                if ((row == 0 && col > 0 && col < width - 1) || 
                    (row == height - 1 && col > 0 && col < width - 1) || 
                    (row == height / 2 && col > 0 && col < width - 1) || 
                    (col == 0 && row > 0 && row < height / 2) || 
                    (col == width - 1 && row > height / 2 && row < height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

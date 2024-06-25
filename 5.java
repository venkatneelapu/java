public class Print5 {
    public static void main(String[] args) {
        int height = 7; // Height of the number 5

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Print stars for the number 5 pattern
                if (row == 0 || row == height / 2 || row == height - 1 || 
                    (col == 0 && row < height / 2) || 
                    (col == height - 1 && row > height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

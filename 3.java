public class Print3 {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Conditions to print the number "3"
                if (row == 0 || row == height / 2 || row == height - 1 || (col == height - 1) || (row < height / 2 && col == 0 && row != 0) || (row > height / 2 && col == 0 && row != height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
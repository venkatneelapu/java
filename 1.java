public class PrintNumberOne {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Conditions to print the number 1 using stars
                // Top horizontal line, middle vertical line, and bottom horizontal line
                if (col == height / 2 || (row == height - 1 && col > 0 && col < height - 1) || (row == 0 && col == height / 2) || (row > 0 && row < height && col == height / 2 - 1 && row < height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

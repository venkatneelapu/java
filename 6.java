public class Print6 {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want
        int width = 5; // Width of the number

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // Conditions to print stars
                if ((col == 0 && (row != 0 && row != height - 1)) || // left vertical line (excluding corners)
                    (col == width - 1 && row >= height / 2) || // right vertical line (bottom half)
                    (row == 0 && col > 0 && col < width - 1) || // top horizontal line (excluding corners)
                    (row == height / 2) || // middle horizontal line
                    (row == height - 1 && col > 0 && col < width - 1) || // bottom horizontal line (excluding corners)
                    (col == 0 && row > height / 2)) { // vertical line left half
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class NumberEightPattern {
    public static void main(String[] args) {
        int height = 7; // The height of the number 8 pattern
        int width = 5;  // The width of the number 8 pattern

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions for printing stars to form the number 8 pattern
                if (i == 0 || i == height - 1 || i == height / 2 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

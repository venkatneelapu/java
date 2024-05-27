public class AlphabetH {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter 'H'
        int width = 5;   // Width of the letter 'H'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' for the borders of 'H'
                if (j == 0 ||                   // Left border
                    j == width - 1 ||           // Right border
                    i == height / 2) {          // Middle bar
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
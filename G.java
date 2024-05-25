public class AlphabetG {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter 'G'
        int width = 7;   // Width of the letter 'G'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' for the borders of 'G'
                if (i == 0 ||                   // Top border
                    i == height - 1 ||          // Bottom border
                    j == 0 ||                   // Left border
                    (j == width - 1 && i >= height / 2) ||  // Right border on lower half
                    (i == height / 2 && j >= width / 2) ||  // Middle bar
                    (i > height / 2 && j == width / 2)) {   // Right vertical line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
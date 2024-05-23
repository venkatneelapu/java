public class AlphabetD {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter 'D'
        int width = 5;   // Width of the letter 'D'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' for the borders of 'D'
                if (j == 0 ||                  // Left border
                    (i == 0 && j < width - 1) ||   // Top border (excluding top right corner)
                    (i == height - 1 && j < width - 1) || // Bottom border (excluding bottom right corner)
                    (j == width - 1 && i != 0 && i != height - 1)) {  // Right border (excluding top and bottom)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
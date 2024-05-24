public class AlphabetF {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter 'F'
        int width = 5;   // Width of the letter 'F'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' for the borders of 'F'
                if (i == 0 ||                   // Top border
                    i == height / 2 ||          // Middle border
                    j == 0) {                   // Left border
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
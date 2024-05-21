public class AlphabetC {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter 'C'
        int width = 5;   // Width of the letter 'C'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' for the borders of 'C'
                if (i == 0 || i == height - 1) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class LetterB {
    public static void main(String[] args) {
        int height = 7; // Height of the letter
        int width = 5;  // Width of the letter

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Printing the vertical segments
                if (j == 0 || (j == width - 1 && i != 0 && i != height / 2 && i != height - 1)) {
                    System.out.print("*");
                }
                // Printing the horizontal segments
                else if ((i == 0 || i == height / 2 || i == height - 1) && j < width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

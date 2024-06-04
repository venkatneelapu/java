public class AlphabetO {
    public static void main(String[] args) {
        int height = 7;  // height of the letter O
        int width = 7;   // width of the letter O
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print '*' at the borders and spaces inside
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

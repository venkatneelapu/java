public class StarA {
    public static void main(String[] args) {
        int height = 7;  // Height of the letter
        int width = 7;   // Width of the letter
        int mid = width / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' to form the letter 'A'
                if (j == 0 || j == width - 1 || i == 0 || i == height / 2) {
                    if (!(i == 0 && (j == 0 || j == width - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

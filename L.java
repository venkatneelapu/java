public class PrintL {
    public static void main(String[] args) {
        int height = 7; // You can adjust the height as needed

        for (int i = 0; i < height; i++) {
            if (i == height - 1) {
                // Print the bottom horizontal line of L
                for (int j = 0; j < height / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                // Print the vertical line of L
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

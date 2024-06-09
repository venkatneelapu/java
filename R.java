public class PrintR {
    public static void main(String[] args) {
        int height = 7;  // You can change the height for a larger or smaller R
        int width = 5;   // You can change the width for a larger or smaller R

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == 0 && j < width - 1) || (i == height / 2 && j < width - 1) ||
                    (j == width - 1 && i > 0 && i < height / 2) || (i == j && i >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
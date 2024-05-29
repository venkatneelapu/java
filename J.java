public class PrintJ {
    public static void main(String[] args) {
        int height = 7;  // You can change the height for a larger or smaller J
        int width = 5;   // You can change the width for a larger or smaller J

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || (i == height - 1 && j < width - 1) || (j == width / 2 && i < height - 1) || (j == 0 && i >= height - 3 && i < height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

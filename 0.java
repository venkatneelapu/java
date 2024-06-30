public class NumberZero {
    public static void main(String[] args) {
        int height = 7; // height of the pattern
        int width = 5;  // width of the pattern

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    // print top and bottom border
                    System.out.print("*");
                } else if (j == 0 || j == width - 1) {
                    // print left and right border
                    System.out.print("*");
                } else {
                    // print space inside the zero
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

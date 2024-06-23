public class Print4 {
    public static void main(String[] args) {
        int height = 7; // You can change the height to any value you want

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                // Conditions to print the number 4 using stars
                if (col == height / 2 || row == height / 2 || (col < height / 2 && row < height / 2 && col == row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class StarPatternM {
    public static void main(String[] args) {
        int height = 7; // Adjust this to change the height of the "M"
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                // Condition to print stars for "M"
                if (j == 0 || j == height || (i == j && i <= height / 2) || (i + j == height && i <= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

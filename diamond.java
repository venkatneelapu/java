public class Diamond {
    public static void main(String[] args) {
        int size = 7; // Size of the diamond (odd number for symmetry)

        // Upper half of the diamond
        for (int i = 1; i <= size; i += 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = size - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

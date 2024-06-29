public class PrintNumber9 {
    public static void main(String[] args) {
        // Top part of number 9
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && (j == 1 || j == 5)) {
                    System.out.print(" ");
                } else if ((i == 2 || i == 3) && (j == 1 || j == 5)) {
                    System.out.print("*");
                } else if ((i == 2 || i == 3) && j == 2) {
                    System.out.print(" ");
                } else if (i == 4 && j != 5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Bottom part of number 9
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (i == 2 && j != 5)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

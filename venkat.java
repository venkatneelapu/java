public class StarPatternName {
    public static void main(String[] args) {
        String name = "VENKAT";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < name.length(); j++) {
                char letter = name.charAt(j);
                printLetter(letter, i);
                System.out.print("  "); // space between letters
            }
            System.out.println();
        }
    }

    // Function to print each letter row by row
    public static void printLetter(char letter, int row) {
        switch (letter) {
            case 'V':
                if (row == 0 || row == 1) System.out.print("*     *");
                else if (row == 2 || row == 3) System.out.print(" *   * ");
                else if (row == 4) System.out.print("  * *  ");
                else if (row == 5) System.out.print("   *   ");
                else System.out.print("       ");
                break;
            case 'E':
                if (row == 0 || row == 6) System.out.print("*******");
                else if (row == 3) System.out.print("*******");
                else System.out.print("*      ");
                break;
            case 'N':
                if (row == 0 || row == 6) System.out.print("*     *");
                else if (row == 1) System.out.print("**    *");
                else if (row == 2) System.out.print("* *   *");
                else if (row == 3) System.out.print("*  *  *");
                else if (row == 4) System.out.print("*   * *");
                else if (row == 5) System.out.print("*    **");
                break;
            case 'K':
                if (row == 0 || row == 6) System.out.print("*    * ");
                else if (row == 1 || row == 5) System.out.print("*   *  ");
                else if (row == 2 || row == 4) System.out.print("*  *   ");
                else if (row == 3) System.out.print("***    ");
                break;
            case 'A':
                if (row == 0) System.out.print("   *   ");
                else if (row == 1) System.out.print("  * *  ");
                else if (row == 2) System.out.print(" *   * ");
                else if (row == 3) System.out.print("*******");
                else System.out.print("*     *");
                break;
            case 'T':
                if (row == 0) System.out.print("*******");
                else System.out.print("   *   ");
                break;
            default:
                System.out.print("       ");
                break;
        }
    }
}

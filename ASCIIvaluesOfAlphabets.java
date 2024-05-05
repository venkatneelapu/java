public class Main {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        for (char alphabet : alphabets) {
            int asciiValue = (int) alphabet;
            System.out.println(alphabet + ": " + asciiValue);
        }
    }
}

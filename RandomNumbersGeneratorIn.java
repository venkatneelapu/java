import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 and 1.0

        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Double: " + randomDouble);
    }
}

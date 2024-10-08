import java.util.Random;

public class RandomPrimeGenerator {
    public static void main(String[] args) {
        int count = 10;  // Number of prime numbers to generate
        for (int i = 0; i < count; i++) {
            System.out.println(generateRandomPrime(50, 500));  // Range for random primes
        }
    }

    // Method to generate a random prime number within a range
    public static int generateRandomPrime(int min, int max) {
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt((max - min) + 1) + min;
        } while (!isPrime(num));
        return num;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

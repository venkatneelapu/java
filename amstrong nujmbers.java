public class ArmstrongNumbers {
    
    // Function to calculate the power of a number
    public static int power(int num, int p) {
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= num;
        }
        return result;
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        int n = countDigits(num);
        
        while (num != 0) {
            int digit = num % 10;
            sum += power(digit, n);
            num /= 10;
        }
        
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int lowerLimit = 100; // Lower limit of the range
        int upperLimit = 1000; // Upper limit of the range
        
        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + ":");
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}

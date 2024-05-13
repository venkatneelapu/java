public class Sphere {
    public static void main(String[] args) {
        int radius = 5; // Adjust the radius of the sphere

        // Loop through each row
        for (int i = -radius; i <= radius; i++) {
            // Loop through each column
            for (int j = -radius; j <= radius; j++) {
                // Calculate distance from center
                double distance = Math.sqrt(i * i + j * j);

                // If distance is less than or equal to radius, print star, else print space
                if (distance <= radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

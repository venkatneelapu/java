import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        double area = calculateEquilateralTriangleArea(sideLength);
        System.out.println("The area of the equilateral triangle is: " + area);

        scanner.close();
    }

    public static double calculateEquilateralTriangleArea(double sideLength) {
        // Area of an equilateral triangle = (sqrt(3) / 4) * sideLength^2
        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        return area;
    }
}

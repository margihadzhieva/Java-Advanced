import java.util.Scanner;

public class P01_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double rectangleSideA = scan.nextDouble();
        double rectangleSideB = scan.nextDouble();
    
        double rectangleArea = rectangleSideA * rectangleSideB;
    
        System.out.printf("%.2f%n", rectangleArea);
    }
}

import java.util.Scanner;

public class AreaFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth of Rectangle : ");
        double breadth = sc.nextDouble();

        System.out.print("Enter Radius of Circle : ");
        double radius = sc.nextDouble();

        double perimeter = (int)(2 * (length + breadth));
        System.out.println("The Perimeter of Rectangle is : " + perimeter);

        double area = (int)(length * breadth);
        System.out.println("The Area of Rectangle is : " + area);

        double circlearea = (int)(22 / 7 * (radius * radius));
        System.out.println("The Area of Circle is : " + circlearea);

        double circumference = (int)(2 * 22 / 7 * radius);
        System.out.println("The Circumference of Circle is : " + circumference);

    }
}

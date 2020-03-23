import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width=sc.nextInt();
        System.out.print("Enter the height: ");
        double height=sc.nextInt();

        Rectangle rectangle=new Rectangle(width, height);

        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+rectangle.getArea());
    }
}
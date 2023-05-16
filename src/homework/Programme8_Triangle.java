package homework;
//Write a program to calculate the area of a triangle.
import java.util.Scanner;

public class Programme8_Triangle {
    public static void tr1(){
        Scanner height = new Scanner(System.in);
        System.out.println("Enter height value:");
        double h = height.nextDouble();
        Scanner base = new Scanner(System.in);
        System.out.println("Enter base value");
        double b = base.nextDouble();
        double Area = (b*h)/2;
        System.out.printf("Area of triangle is: %.2f", Area);

    }

    public static void main(String[] args) {

        tr1();
    }
}

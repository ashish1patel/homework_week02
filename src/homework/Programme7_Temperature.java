package homework;
/**Write a program to insert any temperature value in degree Fahrenheit and
*convert to degree Celsius ((F − 32) × 5/9 = 0°C).
  */
import java.util.Scanner;

public class Programme7_Temperature {
        public static void t1() {
            Scanner t1 = new Scanner(System.in);
            System.out.println("Enter Fahrenheit degree :");

           double f = t1.nextDouble();
            double c = ((f-32)*5/9);
            System.out.printf("Temperature in degree is :%2f", +c);

    }

    public static void main(String[] args) {
        t1();
    }
    }


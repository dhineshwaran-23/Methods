import java.util.Scanner;

public class FunCircle {
    static void calculateCircle(double r){
        double pi = 3.14;
        double Circumference = 2 * pi * r;
        System.out.println("Circumference = " + Circumference);
        double Area = pi * r * r;
        System.out.println("Area = " + Area);
    }
    public static void main(String args[ ]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextDouble();
        calculateCircle(r);
    }
}

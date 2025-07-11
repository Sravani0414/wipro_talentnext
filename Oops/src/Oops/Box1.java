package Oops;
import java.util.Scanner;
public class Box1 {
    double length, width, height;
    Box1(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
        double volume() {
        return length * width * height;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width:");
        double width = sc.nextDouble();
        System.out.println("Enter Height:");
        double height = sc.nextDouble();
        System.out.println("Enter Length:");
        double length = sc.nextDouble();
        Box1 obj = new Box1(length, width, height);
        System.out.println("Volume of Box: " + obj.volume());
        sc.close();
    }
}

package Oops;

import java.util.Scanner;
public class Cal {

    // Static method to calculate power for int
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate power for double
    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer power calculation
        System.out.println("Enter two integers (base and exponent):");
        int intBase = sc.nextInt();
        int intExp = sc.nextInt();
        int intResult = powerInt(intBase, intExp);
        System.out.println("Result (int): " + intResult);

        // Double power calculation
        System.out.println("Enter base as double and exponent as int:");
        double doubleBase = sc.nextDouble();
        int doubleExp = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExp);
        System.out.println("Result (double): " + doubleResult);

        sc.close(); // optional, but good practice
    }
}
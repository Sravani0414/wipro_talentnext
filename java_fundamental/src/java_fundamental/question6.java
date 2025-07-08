package java_fundamental;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter gender (male/female):");
        String gender = sc.nextLine();

        
        System.out.println("Enter age:");
        int age = sc.nextInt();

      
        if (gender.equalsIgnoreCase("female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of interest is 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of interest is 9.2%");
            } else {
                System.out.println("Invalid age entered for female.");
            }
        } else {
            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of interest is 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of interest is 10.5%");
            } else {
                System.out.println("Invalid age entered.");
            }
        }

        sc.close(); 
    }
}

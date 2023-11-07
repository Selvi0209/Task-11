import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj		= new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = obj.nextInt();

            if (age < 18) {
                throw new InvalidAgeException();
            } else {
                System.out.println("Age is valid.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for age.");
        }

        scanner.close();
    }
}

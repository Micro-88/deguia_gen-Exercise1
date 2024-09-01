import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

import java.util.Scanner;

public class HelloWorld {

    //function to ask for user's age
    static void enterAge(Scanner scanner) {         
        // Ask for the user's age
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        // Displays user's age
        System.out.println("Your Age is: " + age + "years old");
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "!");
        
        //call enterAge function to ask for user's age
        enterAge(scanner);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

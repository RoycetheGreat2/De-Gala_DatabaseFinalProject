import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();  // Calling the method to show menu
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in); 
        
        int choice = 0;
        
        while (choice != 3) {  
            System.out.println("Welcome to the Library Management System!");
            System.out.println("Please select an option:");
            System.out.println("1. Register as a new user");
            System.out.println("2. Login as an existing user");
            System.out.println("3. Exit the system");
            System.out.print("Choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose to register as a new user.");
                    
                    break;
                case 2:
                    System.out.println("You chose to log in as an existing user.");
                    
                    break;
                case 3:
                    System.out.println("You chose to exit the system.");
                    
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    
                    break;
            }
        }
        
        scanner.close();  
    }
}

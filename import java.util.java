import java1;

public class CompanyEmployees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of employees
        System.out.println("Enter the number of employees");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Create arrays to store employee data
        String[] employeeNames = new String[numberOfEmployees];
        int[] employeeIDs = new int[numberOfEmployees];

        // Input employee data
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            // System.out.print("Enter ID: ");
            employeeIDs[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter name: ");
            employeeNames[i] = scanner.nextLine();
        }

        // Display employee data
        System.out.println("\nEmployee List:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("ID: " + employeeIDs[i] + ", Name: " + employeeNames[i]);
        }

        scanner.close();
    }
}

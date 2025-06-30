// Driver Class
class Geeks1
{
    // main function
    public static void main(String[] args)
    {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner S = new Scanner(System.in);

        // Read the next integer from the screen
        num = S.nextInt();

        // Display the integer
        System.out.println("Entered integer is: " + num);

        // Close the Scanner object
        S.close(); // Important to prevent resource leaks
    }
}
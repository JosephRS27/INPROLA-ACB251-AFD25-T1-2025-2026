public class Twoinputs {
    public static void main (Stings args[]);
         Scanner input = new Scanner(System.in);
         
         // Asking for two integers inputs 
        System.out.println("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();
        
        // Perform and display operations
        System.out.print("Sum: " + (num1 + num2));
        System.out.print("Difference: " + (num1 - num2));
        System.out.print("Product: " + (num1 * num2));
        System.out.print("Quotient: " + (num1 / num2));

    }
        
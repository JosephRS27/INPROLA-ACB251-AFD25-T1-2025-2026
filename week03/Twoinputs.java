public class Twoinputs {
    public static void main (Stings args[])
         Scanner input = new Scanner(System.in);
         
         // Asking for two integers inputs 
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        // Perform and display operations
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));

    }
        
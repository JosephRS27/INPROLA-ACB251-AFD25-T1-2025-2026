import java.util.Scanner;

class Twoinputs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter two integers individually:");

    // First input
    int firstInteger  = input.nextInt();

    // Second input
    int secondInteger = input.nextInt();


   

    // Output input by user
    System.out.println("Addition: " + (firstInteger + secondInteger)); 
    System.out.println("Subtraction: " + (firstInteger - secondInteger));
    System.out.println("Multiplication: " + (firstInteger * secondInteger));  
    System.out.println("Division: " + (firstInteger / secondInteger)); 
    
  }
}
import java.util.Scanner;
public class forLoops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter two integers individually:");

    // First input
    int firstInteger  = input.nextInt();

    // Second input
    int secondInteger = input.nextInt();
    for (int i = start; i = end; i++){
        if (i%2 == 0 ){
            System.out.println(i);
        }
    }
  }
}
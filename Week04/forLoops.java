import java.util.Scanner;
public class forLoops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter starting number:");
    System.out.println("Enter ending number:");

    // First num
    int start  = input.nextInt();

    // Second num
    int end = input.nextInt();

    for (int i = start; i <= end; i++){
        if (i % 2 == 0 ){
            System.out.println(i);
        }
    }
  }
}
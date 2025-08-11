import java.util.Scanner;
public class forLoops2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // First num
    System.out.print("Enter starting number:");
    int start  = input.nextInt();

    // Second num
    System.out.print("Enter ending number:");
    int end = input.nextInt();
    }
    for (int i = start; i <= end; i++){
        if (i % 2 == 1 ){
            System.out.println(i);
        }
    }
  }

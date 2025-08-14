/**
* EvenNumberFinder.java
* This is the "worker" class. It contains the core logic for
* finding and displaying even numbers within a given range.
* It is separated from the main application to improve organization and reusability.
*/
public class OddNumberFinder {
 
    /**
     * Iterates through a specified range and prints all even numbers.
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     */
    public void findAndDisplayOdds(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a for loop to iterate from the start point to the end point
        // for one line initializaton - condition - increement
        for (int i = start; i <= end; i++) {
            // Check if the current number (i) is even.
            // A number is even if the remainder when divided by 2 is 0.
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
            }
        }
    }
      public void findAndDisplayOdds2(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a for loop to iterate from the start point to the end point
         // while initialzation - condition - increement 
        int i = start;
        while (i <= end) {
             
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
            }
            i++;
        }
    }
    public void findAndDisplayOdds3(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a for loop to iterate from the start point to the end point
        // do-while initialzation - if/statement/increement  - condition
        int i = start;
        do{
              if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
            }
            i++;
            } 
        while (i <= end);
        }

        public void findAndDisplayPrimeNumber(int start, int end) {
        System.out.println("\nPrime numbers in the range " + start + " to " + end + " are:");
           for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false; 
        }
        for (int start = 2; i <= Math.sqrt(i); i++) {
            if (i % i == 0) {
                return false; 
            }
        }
        return true; 
    }

  }

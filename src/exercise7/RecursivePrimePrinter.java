package exercise7;

import java.util.Scanner;
import java.math.*;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
         for (int i = n; i > 0; i --) {
           if (isPrime(i)) {
             System.out.println(i);
           
         } 
       }  // Implement recursive method
    }

    public static boolean isPrime(int n) {
      boolean check = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          check = false;
          break;
        }
      }
        // Implement method
        return check;
    }
}

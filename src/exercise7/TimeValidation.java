package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = false;
        boolean check1 = areHoursValid(hours);
        boolean check2 = areMinutesValid(minutes);
        if (areHoursValid( hours) == true && areHoursValid(hours)==true) {
          timeValid = true;
        } else timeValid = false;
        // Call validation methods
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        if (hours > 0 && hours < 24) {
        return true;
        } else 
        // Implement method
        return false;
    }


    public static boolean areMinutesValid(int minutes) {
      if (minutes > 0 && minutes < 24) {
        return true;
      }
        // Implement method
        return false;
    }
}

package Oppgave2;

import java.util.Scanner; 

public class TowersOfHanoi {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("skirv inn antall disker: ");
    int n = input.nextInt();

    // Find the solution recursively
    System.out.println("Antall bevegelser er :");
    flyttDisker(n, 'A', 'B', 'C');
  }

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
 /* metoden for å finne løsningen til å flytte n antall disker fra fraTaarn til til tilTaarn med auxTaarn.*/
  public static void flyttDisker(int n, char forsteeTaarn,
      char tredjeTaarn, char andreTaarn) {
    if (n == 1) // Stopping condition
      System.out.println("Flytt disk " + n + " fra " +
    		  forsteeTaarn + " til " + tredjeTaarn);
    else {
      flyttDisker(n - 1, forsteeTaarn, andreTaarn, tredjeTaarn);
      System.out.println("Flytt disk  " + n + " fra " +
    		  forsteeTaarn + " til " + tredjeTaarn);
      flyttDisker(n - 1, andreTaarn, forsteeTaarn, tredjeTaarn);
    }
  }
}

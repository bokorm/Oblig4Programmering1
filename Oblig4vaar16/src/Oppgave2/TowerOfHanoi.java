package Oppgave2;
import java.util.Scanner;

public class TowerOfHanoi {
	
	private static int countMovement, countCall;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Bevegelser er :");
		flyttDisker(n, 'A', 'B', 'C');
		System.out.printf("\nAntall kall til metoden ble: %5d\n", countCall);
	}

	public static void flyttDisker(int n, char startTaarn, char sluttTaarn, char lagringTaarn) {
		countCall++;
		if (n == 1) { 
			System.out.printf("nummertrekk: %5d Flytt skiven %2d fr %c\n", countMovement, n, startTaarn, sluttTaarn);
			countMovement++;
		} else {
			flyttDisker(n - 1, startTaarn, lagringTaarn, sluttTaarn);
			System.out.printf("Trekk nummer: %5d Flytt skiven %2d fra %c til %c\n", countMovement, n, startTaarn, sluttTaarn);
			countMovement++;
			flyttDisker(n - 1, lagringTaarn, sluttTaarn, startTaarn);
		}
	}
}

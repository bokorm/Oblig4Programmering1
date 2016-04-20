package Oppgave1;

import java.util.Scanner;

public class Oppgave1 {
	private static int count = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn en setning som skal vendes om.");
		String normal = input.nextLine();
		snuTekst(normal);
	}

	public static void snuTekst(String tekst) {
		snuTekst(tekst, tekst.length() - 1);
	}

	public static void snuTekst(String tekst, int index) {
		if (index >= 0) {
			System.out.print(tekst.charAt(index));
			count++;
			snuTekst(tekst, index-1);
		} else {
			System.out.printf("\nDet er totalt %d i tekststrengen.\n", count);
			count = 0;
		}
	}

}

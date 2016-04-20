package Oppgave1;

import java.util.Scanner;

public class Oppgave1 {
	private static int count = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String normal, reversere = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn en setning som skal vendes om.");
		normal = input.nextLine();
		int length = normal.length();
		for (int i = length - 1; i >= 0; i--)
			reversere = reversere + normal.charAt(i);
		System.out.println("Setningen revesert er = " + reversere);
	}

	public static void baklengs(String tekst) {
		baklengs(tekst);// (tekst.length() - 1);
	}

	public static void snuTekst(String tekst, int index) {
		if (index >= 0) {
			System.out.print(tekst.charAt(index));
			count++;
			baklengs(tekst);
		} else {
			System.out.printf("\nDet er totalt %d i tekststrengen.\n", count);
			count = 0;
		}
	}

	// Validate string.
	// *
	// * @param prompt
	// * Prompt which is shown to user
	// * @return the string that user has provided
	// */
	public static String validateString(String prompt) {

		String respons = "";

		while (respons == null || respons.equals("")) {
			System.out.println(prompt);

			try {

				respons = input.nextLine();

			} catch (Exception ex) {

				System.out.println("Skriv inn en gyldig respons.");
			}
		}
		return respons;
	}

}

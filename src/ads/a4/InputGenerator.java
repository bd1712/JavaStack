package ads.a4;

import java.util.Arrays;
import java.util.Random;

/**
 * Klasse bietet einige statische Methoden zur Generierung von Eingabedaten fuer
 * Sortieralgorithmen.
 *
 * @author jeremic, parzy
 */
public class InputGenerator {

	private static Random rng = new Random();

	/**
	 * Generiert eine Folge von Pseudozufallszahlen.
	 *
	 * @param length Laenge der Folge.
	 * @return Folge von Pseudozufallszahlen in beliebiegr Reihenfolge.
	 */
	public static int[] randomSequence(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(5 * length);
		}
		return array;
	}

	/**
	 * Generiert eine Zahlenfolge, die length-mal die Zahl number enthaelt.
	 *
	 * @param length Laenge der Folge
	 * @param number Zahl
	 * @return Zahlenfolge, die length-mal die Zahl number enthaelt.
	 */
	public static int[] uniformSequence(int length, int number) {
		int[] array = new int[length];
		Arrays.fill(array, number);
		return array;
	}

	/**
	 * Generiert eine aufsteigend sortierte Folge.
	 *
	 * @param length Laenge der Folge.
	 * @return Aufsteigend sortierte Folge.
	 */
	public static int[] increasingSequence(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = i;
		}
		return array;
	}

	/**
	 * Generiert eine absteigend sortierte Folge.
	 *
	 * @param length Laenge der Folge.
	 * @return Absteigend sortierte Folge.
	 */
	public static int[] decreasingSequence(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[length - i - 1] = i;
		}
		return array;
	}

	/**
	 * Einige Testfaelle zur Demonstration der Nutzung.
	 */
	public static void main(String[] args) {
		int a[] = InputGenerator.randomSequence(10);
		int b[] = InputGenerator.uniformSequence(10, 8);
		int c[] = InputGenerator.increasingSequence(10);
		int d[] = InputGenerator.decreasingSequence(10);
		System.out.println("a[] = " + Arrays.toString(a));
		System.out.println("b[] = " + Arrays.toString(b));
		System.out.println("c[] = " + Arrays.toString(c));
		System.out.println("d[] = " + Arrays.toString(d));
	}
}

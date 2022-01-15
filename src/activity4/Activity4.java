package activity4;

import java.util.Arrays;
import java.util.Scanner;

public class Activity4 {

	public void Main() {
		Scanner keyboard = new Scanner(System.in);
		int[] prueba = { 2, 3, 5, 7 };
		boolean exit = true;
		int parametro = 0;
		int value = 0;
		System.out.println("¿que condición quieres (== = 1, > = 2, >= = 3, < = 4, <= = 5, != = 6=)");
		do {
			parametro = keyboard.nextInt();
			if (parametro < 1 || parametro > 6) {
				System.out.println("has introducido un parametro no v�lido, introducelo de nuevo");
			}
		} while (!exit);
		System.out.println("introduce el n�mero para utilizar la condici�n");
		value = keyboard.nextInt();
		System.out.println(Arrays.toString(Activity4.condition(prueba, parametro, value)));
	}

	public static void main(String[] args) {
		new Activity4().Main();
	}

	public static int[] condition(int[] values, int parameter, int value) {
		int valuesLenght = values.length;
		int j = 0;
		for (int i = 0; i < valuesLenght; i++) {
			switch (parameter) {
			case 1:
				if (values[i] == value) {
					j = j + 1;
				}
				break;
			case 2:
				if (values[i] > value) {
					j = j + 1;
				}
				break;
			case 3:
				if (values[i] >= value) {
					j = j + 1;
				}
				break;
			case 4:
				if (values[i] < value) {
					j = j + 1;
				}
				break;
			case 5:
				if (values[i] <= value) {
					j = j + 1;
				}
				break;
			case 6:
				if (values[i] != value) {
					j = j + 1;
				}
				break;
			}
		}
		int[] result = new int[j];
		j = 0;
		for (int i = 0; i < valuesLenght; i++) {
			switch (parameter) {
			case 1:
				if (values[i] == value) {
					result[j] = values[i];
					j++;
				}
				break;
			case 2:
				if (values[i] > value) {
					result[j] = values[i];
					j++;
				}
				break;
			case 3:
				if (values[i] >= value) {
					result[j] = values[i];
					j++;
				}
				break;
			case 4:
				if (values[i] < value) {
					result[j] = values[i];
					j++;
				}
				break;
			case 5:
				if (values[i] <= value) {
					result[j] = values[i];
					j++;
				}
				break;
			case 6:
				if (values[i] != value) {
					result[j] = values[i];
					j++;
				}
				break;
			}
		}
		return result;
	}
}
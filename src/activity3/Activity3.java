package activity3;

import java.util.Arrays;

public class Activity3 {

	public void Main() {
		int[] prueba = { 2, 3, 5, 7, 8 };
		System.out.println(Arrays.toString(Activity3.reverseArray(prueba, -1, 0)));
	}

	public static void main(String[] args) {
		new Activity3().Main();
	}

	public static int[] reverseArray(int[] values, int decreciente, int ascendiente) {
		int[] reserva = { 0 };
		if (decreciente == -1) {
			decreciente = values.length - 1;
		}
		if (values.length == 0) {
			System.out.println("no se puede introducir una array vacia");
			//si por un casual metieramos una array vacia y no pusieramos este if nos daria un StackOverflow
		} else {

			if (decreciente != 0) {
				values = reverseArray(values, decreciente - 1, ascendiente + 1);
			}
			if (ascendiente <= 1) {
				reserva[0] = values[decreciente];
				values[decreciente] = values[ascendiente];
				values[ascendiente] = reserva[0];
			}
		}

		return values;
	}
	//soy un genio, en verdad no pero ha costado lo suyo
}
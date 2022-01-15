package activity7;

import java.util.Arrays;

public class Activity7 {

	public void Main() {
		int[][] prueba = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(Arrays.deepToString(Activity7.copyOf(prueba)));
	}

	public static void main(String[] args) {
		new Activity7().Main();
	}

	public static int[][] copyOf(int[][] values) {

		for (int i = 0; i < values.length; i++) {
			values[i] = Arrays.copyOf(values[i], values[i].length * 2);
		}
		return values;

	}
}
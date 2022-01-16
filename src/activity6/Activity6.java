package activity6;

public class Activity6 {

	public void Main() {
		double[][][] prueba = { { { 1.1, 2.2, 5.6 }, { 1.7, 6.2, 5.2 }, { 0.1, 0.5, 7.8 } },
				{ { 8.1, 3.5, 17.9 }, { 1.23, 2.3, 20.2 }, { 1.1, 2.5, 20.0 } },
				{ { 11.2, 2.7, 18.4 }, { 9.1, 6.2, 1.1 }, { 3.7, 2.58, 0.3 } } };
		System.out.println(Activity6.greaterNumber(prueba));
	}

	public static void main(String[] args) {
		new Activity6().Main();
	}

	public static double greaterNumber(double[][][] values) {
		int valueLength = values.length;
		int secondLength = 0;
		int thirdLength = 0;
		double result = 0.0;
		for (int i = 0; i < valueLength; i++) {
			secondLength = values[i].length;
			for (int j = 0; j < secondLength; j++) {
				thirdLength = values[i][j].length;
				for (int k = 0; k < thirdLength; k++) {
					if (values[i][j][k] > result) {
						result = values[i][j][k];
					}
				}
			}
		}
		return result;
	}
}
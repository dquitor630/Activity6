package activity8;

public class Activity8 {

	public void Main() {
		int[][] prueba = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
		System.out.println(Activity8.simetrico(prueba));
	}

	public static void main(String[] args) {
		new Activity8().Main();
	}

	public static boolean simetrico(int[][] values) {
		int valuesLenght = values.length;
		boolean simetrico = true;
		for (int i = 0; i < valuesLenght; i++) {
			for (int j = 0; j < valuesLenght; j++) {
				if (values[i][j] != values[j][i] || values[i].length != valuesLenght) {
					//ese or que le añado comprueba que la array es cuadrada, en el caso de que alguna de las arrays
					//tenga mas tamaño que el numero de filas, dará false ya que no es simétrica
					simetrico = false;
				}
			}
		}
		return simetrico;
	}
}
package activity5;

public class Activity5 {

	public void Main() {
		int[][] prueba = { { 3, 6, 7 }, { 4, 5, 7 }, { 2, 2, 4 } };
		System.out.println(Activity5.sumaMatriz(prueba));
	}

	public static void main(String[] args) {
		new Activity5().Main();
	}

	public static String sumaMatriz(int[][] values) {
		int valuesLength = values.length;
		String result = "";
		int posicion = 0;
		int suma = 0;
		//si la matriz es cuadrada mide lo mismo en todos los lados asi que con un for y otros dos anidados deberia poder hacerlo
		for (int i = 0; i < valuesLength; i++) {
			suma = 0;
			for (posicion = 0; posicion < valuesLength; posicion++) {
				if (values[i].length == 0) {
					//este if al igual que el siguiente es para evitar un OutOfBounds al introducir una array con arrays vacias
				} else {
					suma = suma + values[i][posicion];
				}
			}
			result = result + "la suma de la fila " + (i + 1) + " es: " + suma + "\n";
			suma = 0;
			for (posicion = 0; posicion < valuesLength; posicion++) {
				if (values[i].length == 0) {
				} else {
					suma = suma + values[posicion][i];
				}
			}
			result = result + "la suma de la columna " + (i + 1) + " es: " + suma + "\n";
			suma = 0;
		}
		return result;

	}
}
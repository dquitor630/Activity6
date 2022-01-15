package activity5;

import java.util.Arrays;
import java.util.Scanner;



public class Activity5 {


	
	public void Main() {
		int[][] prueba = { {2, 3, 5},
						   {2, 3, 5},
						   {2, 3, 5} };
		System.out.println(Activity5.sumaMatriz(prueba));
	}
		
		
		

	public static void main(String[] args) {
		new Activity5().Main();
	}
	
	
	public static String sumaMatriz(int[][] values) {
		int valuesLenght = values.length;
		String result = "";
		int posicion = 0;
		int suma = 0;
	//si la matriz es cuadrada mide lo mismo en todos los lados asi que con un for y otros dos anidados deberia poder hacerlo
		for(int i = 0 ; i < valuesLenght; i++) {
			suma = 0;
			for(posicion = 0 ; posicion < valuesLenght; posicion++) {
				suma = suma + values[i][posicion];
			}
			result = result + "la suma de la fila " + (i + 1) + " es: " + suma + "\n";
			for(posicion = 0 ; posicion < valuesLenght; posicion++) {
				suma = suma + values[posicion][i];
			}
			result = result + "la suma de la columna " + (i + 1) + " es: " + suma + "\n";
			suma = 0;
		}
		return result;
			
	}
}
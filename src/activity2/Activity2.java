package activity2;

import java.util.Arrays;
import java.util.Scanner;



public class Activity2 {


	
	public void Main() {
		int[] prueba = {2, 3, 5, 7};
		System.out.println(Arrays.toString(Activity2.reverseArray(prueba)));
	}
		
		
		

	public static void main(String[] args) {
		new Activity2().Main();
	}
	
	
	public static int[] reverseArray(int[] values) {
		int valuesLenght = values.length;
		int [] result = new int[valuesLenght];
		int y = valuesLenght;
		for(int i = 0 ; i < valuesLenght; i++) {
			result[i] = values[y - 1];
			y -= 1;
		}
		return result;
			
	}
}


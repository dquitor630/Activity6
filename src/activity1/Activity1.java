package activity1;

public class Activity1 {

	public void Main() {
		System.out.println(Activity1.multiply(2, 6, 13, 14));
	}

	public static void main(String[] args) {
		new Activity1().Main();
	}

	public static int multiply(int... values) {
		if (values.length == 0) {
			throw new IllegalArgumentException("introduce algun valor");
		}
		int resultado = 1;
		for (int i = 0; i < values.length; i++) {
			resultado = resultado * values[i];
		}
		return resultado;
	}
}

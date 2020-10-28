import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce un país: ");
			String country = sc.nextLine();
			for (int j = 0; j < country.length(); j++) {
				if (country.charAt(j) == 'e' || country.charAt(j) == 'E') {
					counter++;
				}
			}
			System.out.print("");
		}
		System.out.println("Hay: " + counter + " es.");
	}

}

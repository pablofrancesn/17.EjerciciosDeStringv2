import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < 50; i++) {
			System.out.print("Introduce un nombre: ");
			String name = sc.nextLine();
			for (int j = 0; j < name.length(); j++) {
				if (name.endsWith() || name.charAt(j) == 'E') {
					counter++;
				}
			}
			System.out.print("");
		}
		System.out.println("Hay: " + counter + " es.");
	}

}

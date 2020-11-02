import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int aCounter = 0, oCounter = 0, iCounter = 0;
		for (int i = 0; i < 50; i++) {
			System.out.print("Introduce un nombre: ");
			String name = sc.nextLine();
			for (int j = 0; j < name.length(); j++) {
				if (name.endsWith("a") || name.endsWith("A")) {
					aCounter++;
				}if (name.endsWith("o") || name.endsWith("O")) {
					oCounter++;
				}if (name.endsWith("i") || name.endsWith("I")) {
					iCounter++;
				}
			}
			System.out.print("");
		}
		System.out.println("Hay: " + aCounter + " nombres acabados en A.");
		System.out.println("Hay: " + oCounter + " nombres acabados en O.");
		System.out.println("Hay: " + iCounter + " nombres acabados en I.");
	}

}

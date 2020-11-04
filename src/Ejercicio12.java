import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = true;
        String text = "Escribe aquí la frase";
        int pos = 0, counter = 0;
        System.out.print("Introduce una cadena de texto: ");
        String userText = sc.nextLine();
		while (encontrado  == true) {
			if (text.indexOf(userText, pos) != -1) {
				encontrado = true;
				counter++;
				pos = text.indexOf(userText, pos) + 1;
			}
			else {
				encontrado = false;
			}
			
		}
        System.out.println(counter);
    }
}
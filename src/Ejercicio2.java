import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char letter;
		System.out.print("Introduce una frase: ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		letter = sentence.charAt(0);
		String firstLetter = Character.toString(letter);
		firstLetter = firstLetter.toUpperCase();
		letter = sentence.charAt(sentence.length() - 1);
		String lastLetter = Character.toString(letter);
		lastLetter = lastLetter.toUpperCase();
		System.out.print(firstLetter);
		for (int i = 1; i < sentence.length() - 1; i++) {
			System.out.print(sentence.charAt(i));
		}
		System.out.println(lastLetter);

	}

}

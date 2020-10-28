import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vowels = "aeiou";
		System.out.print("Introduce una frase: ");
		String sentence = sc.nextLine();
		for (int i = 0; i < vowels.length(); i++) {
			sentence = sentence.replace(vowels.charAt(i), '#');
		}
		vowels = vowels.toUpperCase();
		for (int i = 0; i < vowels.length(); i++) {
			sentence = sentence.replace(vowels.charAt(i), '#');
		}
		System.out.println(sentence);

	}

}

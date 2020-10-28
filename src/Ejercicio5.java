import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String lowerCase = "ab";
		String upperCase = "AB";
		System.out.print("Introduce una frase: ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		for (int i = 0; i < lowerCase.length(); i++) {
			sentence = sentence.replace(lowerCase.charAt(i), upperCase.charAt(i));
		}
		System.out.println(sentence);
	}

}

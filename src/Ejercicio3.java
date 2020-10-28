import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vowelsL = "aeiou";
		String vowelsU = "AEIOU";
		System.out.print("Introduce una frase: ");
		String sentence = sc.nextLine();
		for (int i = 0; i < vowelsL.length(); i++) {
			sentence = sentence.replace(vowelsL.charAt(i), vowelsU.charAt(i));
		}
		
		System.out.println(sentence);

	}

}

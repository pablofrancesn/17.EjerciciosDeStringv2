import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String sentence = sc.nextLine();
		sentence = sentence.replace(" ", "");
		System.out.println(sentence);
	}

}

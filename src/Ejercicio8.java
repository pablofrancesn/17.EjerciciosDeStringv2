import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        char letter;
        for (int i = 0; i < 50; i++) {
            System.out.print("Introduce un nombre: ");
            String name = sc.nextLine();
            letter = name.charAt(3);
            text = Character.toString(letter).concat(text);
            System.out.print("");
        }
    }
}

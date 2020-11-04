public class Ejercicio9 {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String text = "Escribe aquí la frase";
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (text.charAt(i) == vowels.charAt(j)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

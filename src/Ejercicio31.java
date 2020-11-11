public class Ejercicio31 {
    public static void main(String[] args) {
        String text = "Frase de prueba para probar cosas", word = "";
        String[] words = text.split(" ");
        text = "";
        for (int i = words.length - 1; i >= 0; i--) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                word = word + words[i].charAt(j);
            }
            words[i] = word;
            text = words[i] + " " + text;
            word = "";
        }
        text = text.trim();
        System.out.println(text);
    }
}



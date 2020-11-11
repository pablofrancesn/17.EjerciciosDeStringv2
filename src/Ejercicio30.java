public class Ejercicio30 {
    public static void main(String[] args) {
        String text = "Frase de prueba para probar cosas";
        String[] words = text.split(" ");
        text = "";
        for (int i = words.length - 1; i >= 0; i--) {
            text = text + words[i];
        }
        text = text.trim();
        System.out.println(text);
    }
}

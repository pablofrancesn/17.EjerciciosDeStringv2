public class Ejercicio10 {
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU ";
        String text = "pta madre";
        boolean vowel = true;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (text.charAt(i) == vowels.charAt(j)) {
                	vowel = true;
                } else {
                    vowel = false;
                }
            }
            if (!vowel) {
            	counter++;
			}
            
        }
        System.out.println(counter);
    }
}

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Java Coding"));
    }
    public static String reverseWords(String str) {

        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if(i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

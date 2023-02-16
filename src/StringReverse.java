public class StringReverse {
    public static void main(String[] args) {
        // Create a method that accepts one string argument
        // and returns reversed version of it
        System.out.println(stringReverse("Coding"));
        System.out.println("*****");
        System.out.println(reverseString("Challenge"));
    }

    // String Reverse - For Loop
    public static String stringReverse(String str) {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // Reverse String - StringBuilder

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

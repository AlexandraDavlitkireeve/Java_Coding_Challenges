import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("code", "done"));
    }
    public static boolean isAnagram (String str, String str1) {
        // convert both String to char[]

        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return  Arrays.equals(arrStr, arrStr1);
    }
}

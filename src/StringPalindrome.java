public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPal("civil"));
        System.out.println(isPal("level"));
    }
    public static boolean isPal(String str) {
        // we will use two 'pointers'. One pointer will start looking from beginning
        // another from the back. If values of pointers are not equal, we can return false
        int end = str.length() - 1;

        for(int start = 0; start < str.length() / 2; start++) {

            if(str.charAt(start) != str.charAt(end - start)) {
                return false;
            }
        }
        return true;
    }
}

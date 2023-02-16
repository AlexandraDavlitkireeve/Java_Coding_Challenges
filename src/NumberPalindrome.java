public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isNumPal(454));
        System.out.println(isNumPal(456));
    }
    public static boolean isNumPal(int num) {

        // num % 10 -> gets most right number
        // num / 10 -> removes most right number
        // num * 10 + value -> to append the value to number

        int original = num;
        int reversed = 0;

        while(num != 0) {
            int rightMost = num % 10; // get right most from num
            reversed = reversed * 10 + rightMost; //append right most to reverse variable
            num = num / 10; // remove right most from num
        }
        System.out.println("original: " + original);
        System.out.println("reversed: " + reversed);

        // remove right most from num
        return  original == reversed;
    }
}

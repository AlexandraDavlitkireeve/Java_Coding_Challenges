public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Swap Two Numbers Without Using A Temporary Variable

        int i = 10;
        int j = 15;

        i = i + j; // 10 + 15 = 25
        j = i - j; // 25 - 15 = 10
        i = i - j; // 25 - 10 = 15

        System.out.println("i: " + i); // 15
        System.out.println("j: " + j); // 10
    }
}

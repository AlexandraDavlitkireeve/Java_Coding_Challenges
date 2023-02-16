import java.util.Random;

public class EvenOdd {
    public static void main(String[] args) {
        int number = new Random().nextInt(15);

        if (number % 2 == 0) {
            System.out.println("Number is even: " + number);
        } else {
            System.out.println("Number is odd: " + number);
        }
    }
}

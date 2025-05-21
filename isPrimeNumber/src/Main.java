//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(">" + i + " " + isEven(i) + "<");
        }

    }
    public static boolean isEven(int number) {
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        boolean isPrime = true;
        for (int i = 3; i < Math.ceil(Math.sqrt(number)); i += 1) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
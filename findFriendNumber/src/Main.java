//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int result = findFriendNumber(i);
            if (findFriendNumber(result) == i && result != i) {
                System.out.println(i + "-" + result);
            }
        }
    }

    public static int findFriendNumber(int number) {
        int total = 1;
        for (int i = 2; i < Math.ceilDiv(number, 2) + 1; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return total;
    }
}
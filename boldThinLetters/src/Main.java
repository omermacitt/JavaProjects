import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] boldLetters = {"a", "ı", "o", "u"};
        String[] thinLetters = {"e", "i", "ö", "ü"};
        List<String> boldLettersList = List.of(boldLetters);
        List<String> thinLettersList = List.of(thinLetters);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String inputString = scanner.nextLine();
        for (char letter : inputString.toCharArray()) {
            if (boldLettersList.contains(String.valueOf(letter))) {
                System.out.print("<b>" + letter + "</b>");
            }
            else if (thinLettersList.contains(String.valueOf(letter))) {
                System.out.print("<i>" + letter + "</i>");
            }
            else {
                System.out.print(letter);
            }
        }
    }
}
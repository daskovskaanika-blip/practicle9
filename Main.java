package practical9.daskovska;
import java.util.Scanner;

public class Main {


    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("введіть строку (мінімум 2 слова, кожне від 3 символів): ");
            input = scanner.nextLine().trim();

            String[] words = input.split("\\s+");

            if (words.length < 2) {
                System.out.println("помилка! потрібно мінімум 2 слова.");
                continue;
            }

            boolean isValid = true;
            for (String word : words) {
                if (word.length() < 3) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return input;
            } else {
                System.out.println("помилка! кожне слово має містити мінімум 3 символи.");
            }
        }
    }


    public static String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }


    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        return result.trim();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = inputString();

        System.out.println("Оберіть дію:");
        System.out.println("1 - перевернути всю строку");
        System.out.println("2 - перевернути кожне слово окремо");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("результат: " + reverseString(text));
        } else if (choice == 2) {
            System.out.println("результат: " + reverseWords(text));
        } else {
            System.out.println("невірний вибір!");
        }
    }
}

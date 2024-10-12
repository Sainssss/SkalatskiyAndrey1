import java.util.Scanner;
import java.text.MessageFormat;

class FormattedOutputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floatNumber = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        String str = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.println("Виведення за допомогою println:");
        System.out.println("Ціле число: " + number);
        System.out.println("Число з плаваючою точкою: " + floatNumber);
        System.out.println("Строка: " + str);
        System.out.println("Логічне значення: " + bool);
        System.out.println();

        String template = "Ціле число: {0}, Число з плаваючою точкою: {1}, Строка: {2}, Логічне значення: {3}";
        String message = MessageFormat.format(template, number, floatNumber, str, bool);

        System.out.println("Виведення за допомогою MessageFormat:");
        System.out.println(message);

        template = "Строка: {2}, Логічне значення: {3}, Число: {0}, Число з плаваючою точкою: {1}";
        message = MessageFormat.format(template, number, floatNumber, str, bool);

        System.out.println("Змінений порядок аргументів:");
        System.out.println(message);
        System.out.println();

        System.out.println("Виведення за допомогою System.out.format:");

        System.out.format("Ціле число (десяткова система): %d%n", number);
        System.out.format("Ціле число (шістнадцяткова система): %x%n", number);
        System.out.format("Ціле число (вісімкова система): %o%n", number);

        System.out.format("Число з плаваючою точкою: %.2f%n", floatNumber);

        System.out.format("Строка з фіксованою шириною (20 символів): %-20s%n", str);

        System.out.format("Логічне значення: %b%n", bool);
    }
}

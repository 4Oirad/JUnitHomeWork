import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней в году: ");
            int days = scanner.nextInt();
            if (daysInYear(year) == days) {
                n++;
                System.out.println("Отлично! Так держать!");
            } else {
                System.out.println("Неправильно! В этом году " + daysInYear(year) + " дней!");
                System.out.println("Набрано очков: " + n);
                break;
            }
        }
    }
    public static int daysInYear(int year) {
        if (year % 400 == 0) {
            return 366;
        } else {
            if (year % 100 == 0) {
                return 365;
            } else {
                if (year % 4 == 0) {
                    return 366;
                } else {
                    return 365;
                }
            }
        }
    }
}
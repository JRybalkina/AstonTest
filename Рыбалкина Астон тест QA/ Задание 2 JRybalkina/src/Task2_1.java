import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int summ = a + b;
        System.out.println("Сумма a и b равна: " + summ);

        int div = a - b;
        System.out.println("Разница a и b равна: " + div);

        if (b == 0) {
            System.out.println("Делить на 0 нельзя!");
        } else {
            int sub = a / b;
            System.out.println("Деление a на b равно: " + sub);
        }

        int mult = a * b;
        System.out.println("Умножение a и b равна: " + mult);

    }
}

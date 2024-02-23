import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку а: ");
        String a = scanner.nextLine();
        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        // Можем сначала проверить с учетом регистра букв
        //if (a.equalsIgnoreCase(b)) {
        //    System.out.println("Строки идентичны, но давай регистр букв!");
        //    System.out.println("Секундочку, мы проверяем..");
        //}

        if (a.equals(b))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}

import java.util.Scanner;
public class Task3 { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    
    System.out.print("Введіть розмір ромба: ");

    if (!scanner.hasNextInt()) {
        System.out.println("Помилка: введіть ціле число.");
        scanner.close();
        return;
    }

    int n = scanner.nextInt();

    if (n <= 0) {
        System.out.println("Розмір має бути додатним числом.");
    } else {
        // Верхня половина ромба разом із середнім рядком
        for (int i = 1; i <= n; i++) {
            // Виводимо пробіли
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Виводимо зірочки
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Нижня половина ромба
        for (int i = n - 1; i >= 1; i--) {
            // Виводимо пробіли
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Виводимо зірочки
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    scanner.close();
}
}
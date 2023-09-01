package zadacha_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } // Не закрываем scanner, чтобы избежать закрытия System.in
    }

    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}
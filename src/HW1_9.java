import java.util.Scanner;

public class HW1_9 {
    public static void main(String[] args) {
        System.out.println("Я сложу цифры, которые вы мне напишите!");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int consoleNumber = myScanner.nextInt();
        int summConsoleNumber = 0;

        while (consoleNumber != 0) {
            summConsoleNumber = consoleNumber + summConsoleNumber;
            System.out.println("Сумма пока равна: " + summConsoleNumber);
            System.out.println("Введите число: ");
            consoleNumber = myScanner.nextInt();
        }
        System.out.println("Итоговое значение суммы равно " + summConsoleNumber);
        myScanner.close();
    }
}

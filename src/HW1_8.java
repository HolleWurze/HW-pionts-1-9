import java.util.Scanner;

public class HW1_8 {
    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
    public static void main(String[] args) {
        int hiddenNumber = getRandomNumber();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Я загадал число от 1 до 10, попробуй угадать его!");
        int playerNumber = myScanner.nextInt();

        while (playerNumber != hiddenNumber) {
            System.out.println("Твое предположение: " + playerNumber);
            System.out.println("Продолжай угадывать, пока не правильно!");
            playerNumber = myScanner.nextInt();
        }
        System.out.println("Молодец ты угадал, загаданное мной число равно " + hiddenNumber);
        myScanner.close();
    }
    
}

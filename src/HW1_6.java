import java.util.Scanner;

public class HW1_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите свой текущий вес на земле: ");
        double quantityWeight = myScanner.nextInt();
        System.out.println("У меня есть информация по следующим планетам:\n" +
                "1. Венера 2. Марс 3. Юпитер\n" +
                "4. Сатурн 5. Уран 6. Нептун\n" +
                "Какую бы вы хотели посетить?");
        int numberOfPlanet = myScanner.nextInt();
        myScanner.close();
        System.out.println("Вы выбрали " + numberOfPlanet + " планету");
        switch (numberOfPlanet) {
            case 1:
                quantityWeight = quantityWeight * 0.78;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
            case 2:
                quantityWeight = quantityWeight * 0.39;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
            case 3:
                quantityWeight = quantityWeight * 2.65;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
            case 4:
                quantityWeight = quantityWeight * 1.17;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
            case 5:
                quantityWeight = quantityWeight * 1.05;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
            case 6:
                quantityWeight = quantityWeight * 1.23;
                System.out.println("Ваш вес на данной планете составит: " + quantityWeight + " кг.");
                break;
        }
    }
}

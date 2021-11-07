import java.text.NumberFormat;
import java.util.Scanner;

public class HW1_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите ваш рост в метрах:");
        double heightInMeters = myScanner.nextDouble();
        System.out.println("Введите ваш вес в килограммах: ");
        double weightInKgs = myScanner.nextDouble();
        myScanner.close();

        double resultIMTRus = weightInKgs / (Math.pow(heightInMeters, 2));
        NumberFormat doubleFormat = NumberFormat.getNumberInstance();
        doubleFormat.setMaximumFractionDigits(5);
        String resultIMTRusStr = doubleFormat.format(resultIMTRus);
        System.out.println("Ваш рост в метрах: " + heightInMeters);
        System.out.println("Ваш вес в килограммах: " + weightInKgs);
        System.out.println("Ваш ИМТ составляет (Русская система): " + resultIMTRusStr);

        double heightInInch = heightInMeters * 39.37008;
        double weightInLbs = weightInKgs * 2.2046226;

        System.out.println("Ваш рост в Дюймах: " + heightInInch);
        double heightInFoot = heightInInch * 0.083;
        System.out.println("Ваш рост в Футах: " + heightInFoot);
        System.out.println("Ваш вес в Фунтах: " + weightInLbs);

        double resultIMTUsa = (weightInLbs / (Math.pow(heightInInch, 2))) * 703;
        String resultIMTUsaStr = doubleFormat.format(resultIMTUsa);
        System.out.println("Ваш ИМТ составляет (Американская система): " + resultIMTUsaStr);
    }
}

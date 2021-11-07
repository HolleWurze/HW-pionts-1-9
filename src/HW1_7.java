public class HW1_7 {
    public static int getRandomNumber() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {

        int a = getRandomNumber();
        int b = getRandomNumber();
        System.out.println("Бросок №1: " + a);
        System.out.println("Бросок №2: " + b);

        int c = a + b;
        System.out.println("Вы выбросили: " + c);
    }
}

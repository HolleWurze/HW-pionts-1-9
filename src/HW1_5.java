import java.util.Scanner;
public class HW1_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Эй, как тебя зовут? ");
        String nameOfGuy = myScanner.nextLine();
        System.out.println("Хорошо, " + nameOfGuy + ", сколько тебе лет?");
        int ageOfGuy = myScanner.nextInt();
        myScanner.close();
        if (ageOfGuy >= 25){
            System.out.println("Вы можете делать все, что законно");
        } else if (ageOfGuy < 25) {
            System.out.println("Вы не можете арендовать автомобиль");
            if (ageOfGuy < 18) {
                System.out.println("Вы не можете голосовать");
                if (ageOfGuy < 16){
                    System.out.println("Ты не умеешь водить машину");
                }
            }
        }
    }
}

import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String nameWorker = myScanner.nextLine();
        System.out.println("Hello! " + nameWorker + "!" + " How old are you?");
        String ageWorker = myScanner.nextLine();
        System.out.println("So you're " + ageWorker + ", eh?  That's not old at all!\n" + "How much do you make, "
                + nameWorker + "?");
        float employeesSalary = myScanner.nextFloat();
        System.out.println(employeesSalary + "!  I hope that's per hour and not per year! LOL!");
        myScanner.close();
    }
}

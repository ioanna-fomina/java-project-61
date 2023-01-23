package hexlet.code;
import java.util.Scanner;
public class Cli {
    //Scanner scanner;
    //public static String userName = "";

    //public Cli(Scanner scanner) {
    //    this.scanner = scanner;
    //}
    public static void greeting(Scanner scanner) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        App.userName = scanner.next();
        System.out.println("Hello, " + App.userName + "!");

        //scanner.close();
    }
}

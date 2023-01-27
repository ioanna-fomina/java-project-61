package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName;
    public static void greeting(Scanner scanner) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}

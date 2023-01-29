package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String userName;
    Cli(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    //public void setUserName(String userName) {
    //    this.userName = userName;
    //}
    public static String greeting(Scanner scanner) {
        //Cli user = new Cli();
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli user = new Cli(scanner.next());
        System.out.println("Hello, " + user.getUserName() + "!");
        return user.getUserName();
    }
}

package hexlet.code;

import java.util.Scanner;

public class App {
    public static String userName;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
                Cli.greeting(scanner);
                scanner.close();
                break;
            case "2":
                Cli.greeting(scanner);
                Even.isEven(scanner);
                break;
            case "0":
                scanner.close();
                break;
        }
    }
}
